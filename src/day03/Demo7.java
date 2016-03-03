package day03;

public class Demo7 {
	public static void main(String[] args) {
		Person p1 = new Person("王丽", 14);
		Person p2 = new Person("郑伟", 29);
		p1.compareAge(p2);
	}
}

class Person {
	
	String name;
	
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void compareAge(Person p) {
		if (this.age > p.age) {
			System.out.println(this.name + "大");
		} else if (this.age < p.age) {
			System.out.println(p.name + "大");
		} else {
			System.out.println(this.name + "和" + p.name + "一样大");
		}
	}
}