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
		System.out.println("��̬��������");
	}
	
	public void testInstatic() {
		System.out.println("�Ǿ�̬��������"+this);// ��̬�������ܳ���this
	}
}
