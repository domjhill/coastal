package tests.visualization;

public class SwitchTest2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int x = 5;
		int y = 10;
		int z = 15;
		test(x, y, z);
	}

	private static void test(int a, int b, int d) {
		int c = 99;
		switch (a) {
		case 1:
			c = 1;
			switch (d) {
			case 1:
				if (c == 1) {
					c += 100;
				} else {
					c += 50;
				}
				break;
			case 2:
				if (c == 1) {
					c += 200;
				} else {
					c += 150;
				}
				break;
			}
			break;
		case 2:
			c = 2;
			switch (b) {
			case 1:
				if (c == 2 && d == 15) {
					c += 15;
				} else if (c == 2 && d == 10) {
					c += 10;
				} else {
					c += 5;
				}
				break;
			case 2:
				c += 20;
				break;
			}
			break;
		}
		
		System.out.println(c);
	}
}
