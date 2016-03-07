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
		System.out.println(name+"支持单继承");
	}
	
	public void polymorphism() {
		System.out.println(name+"支持多态");
	}
}

class CPP extends OOP {
	
	String name;
	
	public CPP(String name) {
		this.name = name;
	}
	
	public void inherit() {
		System.out.println(name+"支持多继承");
	}
	
	public void polymorphism() {
		System.out.println(name+"支持多态");
	}
	
	/**
	 * CPP独有的方法调用时必须要进行强制类型转换
	 */
	public void pointer() {
		System.out.println(name+"有指针");
	}

}