// CHECKSTYLE:OFF
package za.ac.sun.cs.coastal.utility;

public class DocRun {

	public static void main(String[] args) {
		if (args.length == 0) {
			String[] params = new String[] {
					"-classpath", "/Users/jaco/Public/Dropbox/WORKSPACE/coastal/build/classes/java/main:/Users/jaco/Public/Dropbox/WORKSPACE/coastal/build/resources/main:/Library/Java/JavaVirtualMachines/jdk1.8.0_31.jdk/Contents/Home/lib/tools.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/commons-beanutils/commons-beanutils/1.9.3/c845703de334ddc6b4b3cd26835458cb1cba1f3d/commons-beanutils-1.9.3.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.6/815893df5f31da2ece4040fe0a12fd44b577afaf/commons-io-2.6.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-core/2.10.0/c90b597163cd28ab6d9687edd53db601b6ea75a1/log4j-core-2.10.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.10.0/fec5797a55b786184a537abd39c3fa1449d752d6/log4j-api-2.10.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-configuration2/2.4/208279841cb092e0f51f097c1f1649341e6333f3/commons-configuration2-2.4.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-commons/7.0/478006d07b7c561ae3a92ddc1829bca81ae0cdd1/asm-commons-7.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-util/7.0/18d4d07010c24405129a6dbb0e92057f8779fb9d/asm-util-7.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-analysis/7.0/4b310d20d6f1c6b7197a75f1b5d69f169bc8ac1f/asm-analysis-7.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-tree/7.0/29bc62dcb85573af6e62e5b2d735ef65966c4180/asm-tree-7.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/7.0/d74d4ba0dee443f68fb2dcb7fcdb945a2cd89912/asm-7.0.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.eclipse.jgit/org.eclipse.jgit/5.1.3.201810200350-r/f270dbd1d792d5ad06074abe018a18644c90b60e/org.eclipse.jgit-5.1.3.201810200350-r.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.2/4bfc12adfe4842bf07b657f0369c4cb522955686/commons-logging-1.2.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/commons-collections/commons-collections/3.2.2/8ad72fe39fa8c91eaaf12aadb21e0c3661fe26d5/commons-collections-3.2.2.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-text/1.6/ba72cf0c40cf701e972fe7720ae844629f4ecca2/commons-text-1.6.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.8.1/6505a72a097d9270f7a9e7bf42c4238283247755/commons-lang3-3.8.1.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/com.jcraft/jsch/0.1.54/da3584329a263616e277e15462b387addd1b208d/jsch-0.1.54.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/com.jcraft/jzlib/1.1.1/a1551373315ffc2f96130a0e5704f74e151777ba/jzlib-1.1.1.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/com.googlecode.javaewah/JavaEWAH/1.1.6/94ad16d728b374d65bd897625f3fbb3da223a2b6/JavaEWAH-1.1.6.jar:/Users/jaco/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.2/81d61b7f33ebeab314e07de0cc596f8e858d97/slf4j-api-1.7.2.jar",
					"-d", "/Users/jaco/Public/Dropbox/WORKSPACE/coastal/build/docs/api",
					"-doclet", "za.ac.sun.cs.coastal.utility.Doclet",
					"-docletpath", "/Users/jaco/Public/Dropbox/WORKSPACE/coastal/build/classes/java/main",
					"-doctitle", "coastal v0.0.2-62-g0a9bf94.dirty API",
					"-noqualifier", "java.lang.*:java.io.*:java.util.*:org.apache.*",
					"-quiet",
					"-private",
					"-windowtitle", "coastal v0.0.2-62-g0a9bf94.dirty API",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/org/sosy_lab/sv_benchmarks/Verifier.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/diver/DiverFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/diver/SegmentedPC.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/diver/SymbolicFrame.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/diver/SymbolicState.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/TaskFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/messages/Broker.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/messages/Tuple.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/Bytecodes.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/LightMethodAdapter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/HeavyAdapter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/LightClassLoader.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/HeavyClassLoader.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/LightAdapter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/InstrumentationClassManager.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/instrument/HeavyMethodAdapter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/pathtree/PathTree.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/pathtree/PathTreeNode.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/RealVariable.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/IntegerVariable.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Visitor.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Operation.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/VisitorException.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Constant.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Expression.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Variable.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/Solver.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/IntegerConstant.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/solver/RealConstant.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/Symbolic.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/Trigger.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/Banner.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/model/String.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/model/Math.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/Reporter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/COASTAL.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/Execution.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/CompletedRunException.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/Payload.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/VM.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/SymbolicException.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/AbortedRunException.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/State.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/LimitConjunctException.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/symbolic/Model.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/MarkerCoverageFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/ObserverFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/LineCoverageFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/AssertControllerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/ConditionCoverage.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/GUIFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/PCMonitorFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/InstructionCoverageFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/observers/StopControllerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/ConfigHelper.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/surfer/TraceState.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/surfer/SurferFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/surfer/Trace.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/Version.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/package-info.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/pathbased/PathBasedFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/pathbased/RandomPathFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/pathbased/DepthFirstFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/pathbased/BreadthFirstFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/pathbased/GenerationalFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/tracebased/TraceBasedFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/tracebased/RandomTestingFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/MTRandom.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/StrategyFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/CybridFuzzerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/BitInputStream.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/MybridFuzzerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/GybridFuzzerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/HybridFuzzerFactory.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/strategy/hybrid/BitOutputStream.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/za/ac/sun/cs/coastal/utility/Doclet.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/strings/Mystery.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/strings/DeadBeef.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/strings/DeadBeef2.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/strings/DB.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/strings/JAFLExample.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/fuzzing/Fuzzing07.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/fuzzing/Fuzzing08.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/jcute/BSTree.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/learning/Example.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/remainder/Remainder.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/SimpleMaxChoice.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Switching4.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Switching5.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Switching2.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/FourTree.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Exceptions1.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Array02.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Switching3.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Exceptions2.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/MaxChoice4.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/MaxMin.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/StateMachine.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/XYPrint.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Max.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Min.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/MaxChoice.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Switching1.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Exceptions3.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/DSEBetter.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/Exceptions4.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/MaxChoice2.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/XYChoice.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/MaxChoice3.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/simple/DepthLimitTest.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPSanfoundry.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPAnuvrat.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPLang.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMP.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPScgilardi.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPSchoenig.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/kmp/KMPVboutchkova.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/statik/Statik03A.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/statik/Statik02.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/statik/Statik01.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/statik/Statik03B.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/bintree/BinTree3.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/bintree/BinTree2.java",
					"/Users/jaco/Public/Dropbox/WORKSPACE/coastal/src/main/java/examples/bintree/BinTree4.java"
			};
			com.sun.tools.javadoc.Main.execute(params);
		} else {
			com.sun.tools.javadoc.Main.execute(args);
		}
	}

}
