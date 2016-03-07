package day06;

public class Demo4 {
	public static void main(String[] args) {
		
		OOP oop_cpp = new CPP("C++");
		print(oop_cpp);
		
		OOP oop_java = new Java("Java");
		print(oop_java);
	}
	
	public static void print(OOP oop) {
		if (oop instanceof Java) {
			Java oop_java = (Java)oop;
			oop_java.inherit();
			oop_java.polymorphism();
		} else {
			CPP oop_cpp = (CPP)oop;
			oop_cpp.inherit();
			oop_cpp.pointer();
			oop_cpp.polymorphism();
		}
	}
}

abstract class OOP {
	
	public abstract void inherit();
	
	public abstract void polymorphism();
	
}

class Java extends OOP {
	
	String name;
	
	public Java(String name) {
		this.name = name;
	}
	
	public void inherit() {
		System.out.println(name+"֧�ֵ��̳�");
	}
	
	public void polymorphism() {
		System.out.println(name+"֧�ֶ�̬");
	}
}

class CPP extends OOP {
	
	String name;
	
	public CPP(String name) {
		this.name = name;
	}
	
	public void inherit() {
		System.out.println(name+"֧�ֶ�̳�");
	}
	
	public void polymorphism() {
		System.out.println(name+"֧�ֶ�̬");
	}
	
	/**
	 * CPP���еķ�������ʱ����Ҫ����ǿ������ת��
	 */
	public void pointer() {
		System.out.println(name+"��ָ��");
	}

}