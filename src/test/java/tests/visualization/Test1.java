package tests.visualization;

public class Test1 {
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
		if (x == 5) {
			System.out.println("x == 5");
		} else {
			if (x < 2) {
				System.out.println("x < 2");
			}
			
			if (x > 3) {
				System.out.println("x > 3");
			}
			
			System.out.println("x != 5");
		}
	}
}
