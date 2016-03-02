package day01;

public class Demo12 {
	public int add(int a, int b) {
		return a+b;
	}
	
	public static int mod(int a, int b) {
		return a % b;
	}
	
	public static void main(String[] args) {
		Demo12 d = new Demo12();
		int c = d.add(2, 5);
		System.out.println(c);
		
		int e = mod(10, 3);
		System.out.println(e);
	}
}
