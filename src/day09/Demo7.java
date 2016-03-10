package day09;

public class Demo7 {
	public static void main(String[] args) {
		String s = "º¼ÖÝÎ÷ºþ";
		reverse(s);
	}
	
	public static void reverse(String s) {
		char[] a = s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				char temp = a[j];
				a[j] = a[a.length-1];
				a[a.length-1] = temp;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
