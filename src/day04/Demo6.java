package day04;

public class Demo6 {
	public static void main(String[] args) {
		
		Children c = new Children("����");
		c.sleep();
	}
}

class Parent {
	
	String name;
	
	public Parent(String name) {
		this.name = name;
		System.out.println(name+"���ø���Ĺ��캯��");
	}
	
	public void sleep() {
		System.out.println(name+"˯����");
	}
}

class Children extends Parent {
	
	public Children(String name) {
		super(name);
		System.out.println(name+"�����Լ��Ĺ��캯��");
	}
	
	/**
	 * ��������д
	 */
	public void sleep() {
		System.out.println(name+"����˯��");
	}
}