package day04;

public class Demo6 {
	public static void main(String[] args) {
		
		Children c = new Children("明明");
		c.sleep();
	}
}

class Parent {
	
	String name;
	
	public Parent(String name) {
		this.name = name;
		System.out.println(name+"调用父类的构造函数");
	}
	
	public void sleep() {
		System.out.println(name+"睡觉了");
	}
}

class Children extends Parent {
	
	public Children(String name) {
		super(name);
		System.out.println(name+"调用自己的构造函数");
	}
	
	/**
	 * 方法的重写
	 */
	public void sleep() {
		System.out.println(name+"不想睡觉");
	}
}