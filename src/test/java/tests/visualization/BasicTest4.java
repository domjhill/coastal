package tests.visualization;

public class BasicTest4 {
	public static void main(String[] args) {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int x = 5;
		int y = 10;
		test(x, y);
	}
	
	private static void test(int x, int y) {
		int c = 10;
		if (x == y) {
			c = 1;
		} else {
			if (x < y) {
				if (x > 0) {
					
				} else {
					if (y < 10) {
						if (x < 4) {
							c = 2;
						}
					} else {
						c = 3;
					}
				}
			} else {
				if (y > 10) {
					if (x < 10) {
						c = 4;
					}
				} else {
					c = 4;
				}
			}
		}
		
		System.out.println(c);
	}
}
