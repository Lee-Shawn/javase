package day04;

public class Demo5 {
	public static void main(String[] args) {
		
		Student s = new Student(111, "kobe", 23);
		s.eat();
	}
}

class Person {
	
	String name;
	
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + "�����˸��๹�캯��");
	}
	
	public Person() {
		System.out.println(name + "�����˸����޲ι��캯��");
	}
	
	public void eat() {
		System.out.println(name + "�ڳԷ�");
	}
}

class Student extends Person {
	
	int id;
	
	public Student(int id, String name, int age) {
//		super(name, age);// ���ø�����εĹ��캯��
		// û��ָ�����ø���Ĺ��췽����java������Ĭ�ϵ��ø�����޲ι��캯��
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println(name + "���������๹�캯��");
	}
	
	public void study() {
		System.out.println(name + "��ѧϰ");
	}
}