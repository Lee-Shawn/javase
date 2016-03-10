package day09;

public class Demo1 {
	public static void main(String[] args) {
		Person p1 = new Person("miki");
		Person p2 = new Person("miki");
		System.out.println(p1.equals(p2));
	}
}

class Person {
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * equals默认情况下是比较两个对象的地址是否相同，重写后比较的是两个对象的内容是否相同
	 */
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if (this.name == p.name) {
			return true;
		} else {
			return false;
		}
	}
}
