package tests.visualization;

public class BasicWhile1 {
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
		int y = 0;
		int z = 4; // Stopping number
		
		while (y <= x) {
			y++;
			
			if (y == z) {
				return;
			}
		}
	}
}
