package day07;

public class Demo3 {
	public static void main(String[] args) {
		try {
			div(2, 0);
		} catch (Exception e) {
			System.out.println("≤∂ªÒ“Ï≥£");
			e.printStackTrace();
		}
	}
	
	public static void div(int a, int b) throws Exception {
		int c = a / b;
		System.out.println(c);
	}
}