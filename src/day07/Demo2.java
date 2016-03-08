package day07;

public class Demo2 {
	public static void main(String[] args) {
		//Throwable t = new Throwable();
		//System.out.println(t.toString());
		div(2, 0);
	}
	
	public static void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("除数不能为0");
			e.printStackTrace();
		}
	}
}
