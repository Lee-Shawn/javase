package day09;

public class Demo9 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "laughing";
		// 把s2连接到s1的后面
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		char[] data = {'e', 'f', 'f', 'e', 'c', 't', 'i', 'v', 'e'};
		// 复制字符数组中的值到字符串中
		String str = String.copyValueOf(data);
		System.out.println(str);
		// 复制指定位置的字符到字符串中
		String s = String.copyValueOf(data, 3, 3);
		System.out.println(s);
		
		String s3 = "abcdefg";
		String s4 = "ABCDEFGABCDEFG";
		// 替换原字符串中的字符的b
		s3 = s3.replace("b", "B");
		System.out.println(s3);
		// 替换原字符串中所有的A
		s4 = s4.replaceAll("A", "a");
		System.out.println(s4);
	}
}
