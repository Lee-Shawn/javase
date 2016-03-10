package day09;

public class Demo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		// s1,s2都指向常量池中的同一个字符串
		System.out.println("s1==s2?"+(s1==s2));

		// s2,s3,s4的内存地址不同
		System.out.println("s2==s3?"+(s2==s3));
		System.out.println("s3==s4?"+(s3==s4));
		
		// String类重写了equals方法，比较的是两个对象的内容
		System.out.println("s3equals(s4)?"+s3.equals(s4));
		
		// 如果是s.euqals("hello")，string中传null会出现空指针错误
		string(null);
	}
	
	public static void string(String s) {
		// 通常用字符串常量来调用equals方法，不会初现空指针
		if ("hello".equals(s)) {
			System.out.println("相同");
		} else {
			System.out.println("不同");
		}
	}
}
