package day27;

public class Demo1 {
	public static void main(String[] args) {
		Integer i = object(123);
		System.out.println(i);
		String s = object("java");
		System.out.println(s);
	}
	
	public static <T>T object(T obj) {
		return obj;
	}
}
