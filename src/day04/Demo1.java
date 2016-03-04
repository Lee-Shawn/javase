package day04;

public class Demo1 {
	public static void main(String[] args) {
		Static s = new Static();
		s.testInstatic();
		//s.testStatic();
		Static.testStatic();
	}
}

class Static {
	public static void testStatic() {
		System.out.println("静态函数调用");
	}
	
	public void testInstatic() {
		System.out.println("非静态函数调用"+this);// 静态函数不能出现this
	}
}
