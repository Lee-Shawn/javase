package day03;

public class Demo7 {
	public static void main(String[] args) {
		Person p1 = new Person("����", 14);
		Person p2 = new Person("֣ΰ", 29);
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
			System.out.println(this.name + "��");
		} else if (this.age < p.age) {
			System.out.println(p.name + "��");
		} else {
			System.out.println(this.name + "��" + p.name + "һ����");
		}
	}
}