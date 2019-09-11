package tests.visualization;

public class BasicFor1 {
	public static void main(String[] args) {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int x = 3;
		test(x);
	}

	private static void test(int x) {
		int c = 4;
		int a = 2;
		
		for (int y = 0; y <= x; y++) {
			if (y <= a) {
				if (y != 1) {
					
				} else {
					
				}
			} else {
				if (y == a) {
					
				} 
			}
			
			if (y == c) {
				return;
			}
		}
	}
}
