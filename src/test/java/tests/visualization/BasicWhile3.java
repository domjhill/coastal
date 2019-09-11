package tests.visualization;

public class BasicWhile3 {
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
		int y = 8;
		int z = 4; // Stopping number
		int a = 10;
		
		while (y >= x) {
			y--;
			
			if (y < a) {
				if (y > x) {
					z++;
				} 
			} else {
				z++;
			}
			
			if (y == z) {
				return;
			}
		}
	}
}
