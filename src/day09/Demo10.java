package day09;

public class Demo10 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello,");
		sb.append("welcome to ");
		sb.append("java");
		
		System.out.println(sb.toString());
		
		int len = sb.length();
		System.out.println(len);
	}
}
