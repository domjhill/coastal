package tests.visualization;

public class BasicTest2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int x = 5;
		test(x);
	}

	private static void test(int x) {
		int c = 0;
		if (x != 5) {
			c = 1;
		} else {
			if (x >= 2) {
				c = 2;
			} else {
				c = 3;
			}

			if (x > 3) {
				c = 4;
			}
		}
		
		System.out.println(c);
	}
}
