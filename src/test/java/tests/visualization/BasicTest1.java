package tests.visualization;

public class BasicTest1 {
	public static void main(String[] args) {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int x = 5;
		test(x);
	}

	private static void test1(int x) {
		int c = 0;
		if (x == 5) {
			c = 1;
		} else {
			if (x < 2) {
				c = 2;
			}

			if (x > 3) {
				c = 3;
			}
		}
		
		System.out.println(c);
	}
	
	private static void test(int x) {
		int c = 0;
		if (x != 5) {
			if (x < 2) {
				c = 2;
			}

			if (x > 3) {
				c = 3;
			}
		} else {
			c = 1;
		}
		
		System.out.println(c);
	}
}
