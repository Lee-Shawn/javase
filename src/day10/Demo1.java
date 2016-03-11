package day10;

public class Demo1 {
	public static void main(String[] args) {
		test();
	}
	
	public static int test() {
		int x = 0;
		
		try {
			return x;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			x++;
			System.out.println(x);
		}
		
		return x;
	}
}
