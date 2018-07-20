package za.ac.sun.cs.coastal.symbolic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.logging.log4j.Logger;

import za.ac.sun.cs.coastal.Configuration;
import za.ac.sun.cs.coastal.instrument.InstrumentationClassLoader;
import za.ac.sun.cs.coastal.reporting.Banner;
import za.ac.sun.cs.coastal.reporting.Reporter;
import za.ac.sun.cs.coastal.strategy.Strategy;
import za.ac.sun.cs.green.expr.Constant;

public class Diver implements Reporter {

	private final Configuration configuration;

	private final Logger log;

	private int runs = 0;

	private long time = 0;

	private final InstrumentationClassLoader instrumentationClassLoader;

	public Diver(Configuration configuration) {
		this.configuration = configuration;
		this.log = configuration.getLog();
		configuration.getReporterManager().register(this);
		SymbolicState.initialize(configuration);
		String cp = System.getProperty("java.class.path");
		instrumentationClassLoader = new InstrumentationClassLoader(configuration, cp);
	}

	public void dive() {
		Strategy strategy = configuration.getStrategy();
		if (strategy == null) {
			log.fatal("NO STRATEGY SPECIFIED -- TERMINATING");
			System.exit(1);
		}
		Map<String, Constant> concreteValues = null;
		long runLimit = configuration.getLimitRuns();
		if (runLimit == 0) {
			runLimit = Long.MIN_VALUE;
		}
		long timeLimit = configuration.getLimitTime();
		if (timeLimit == 0) {
			timeLimit = Long.MAX_VALUE;
		}
		long tl0 = System.currentTimeMillis();
		do {
			if ((System.currentTimeMillis() - tl0) / 1000 > timeLimit) {
				log.warn("time limit reached");
				return;
			}
			if (--runLimit < 0) {
				log.warn("run limit reached");
				return;
			}
			runs++;
			log.info(Banner.getBannerLine("starting dive " + runs, '-'));
			long t0 = System.currentTimeMillis();
			SymbolicState.reset(concreteValues);
			performRun();
			time += System.currentTimeMillis() - t0;
			concreteValues = strategy.refine();
		} while ((concreteValues != null) && SymbolicState.mayContinue());
	}

	public int getRuns() {
		return runs;
	}

	private static final PrintStream NUL = new PrintStream(new OutputStream() {
		@Override
		public void write(int b) throws IOException {
			// do nothing
		}
	});

	private void performRun() {
		PrintStream out = System.out, err = System.err;
		try {
			Class<?> clas = instrumentationClassLoader.loadClass(configuration.getMain());
			Method meth = clas.getMethod("main", String[].class);
			// Redirect System.out/System.err
			if (!configuration.getEchoOutput()) {
				System.setOut(NUL);
				System.setErr(NUL);
			}
			meth.invoke(null, new Object[] { new String[0] });
			System.setOut(out);
			System.setErr(err);
		} catch (ClassNotFoundException x) {
			System.setOut(out);
			System.setErr(err);
			x.printStackTrace();
		} catch (NoSuchMethodException x) {
			System.setOut(out);
			System.setErr(err);
			x.printStackTrace();
		} catch (SecurityException x) {
			System.setOut(out);
			System.setErr(err);
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			System.setOut(out);
			System.setErr(err);
			x.printStackTrace();
		} catch (IllegalArgumentException x) {
			System.setOut(out);
			System.setErr(err);
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			System.setOut(out);
			System.setErr(err);
			Throwable t = x.getCause();
			if ((t == null) || !(t instanceof LimitConjunctException)) {
				x.printStackTrace();
			// else: limit on nr of conjuncts has been reached
			}
		}
	}

	// ======================================================================
	//
	// REPORTING
	//
	// ======================================================================

	@Override
	public String getName() {
		return "Dive";
	}

	@Override
	public void report(PrintWriter info, PrintWriter trace) {
		Map<String, Integer> markers = SymbolicState.getMarkers();
		if (markers.size() > 0) {
			info.println("  === MARKERS ===");
			for (Map.Entry<String, Integer> entry : markers.entrySet()) {
				info.printf("    %-10s %6d\n", entry.getKey(), entry.getValue());
			}
		}
		info.println("  Runs: " + runs);
		info.println("  Overall dive time: " + time);
	}

}
