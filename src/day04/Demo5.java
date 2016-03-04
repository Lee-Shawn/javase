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
		System.out.println(name + "调用了父类构造函数");
	}
	
	public Person() {
		System.out.println(name + "调用了父类无参构造函数");
	}
	
	public void eat() {
		System.out.println(name + "在吃饭");
	}
}

class Student extends Person {
	
	int id;
	
	public Student(int id, String name, int age) {
//		super(name, age);// 调用父类带参的构造函数
		// 没有指定调用父类的构造方法，java编译器默认调用父类的无参构造函数
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println(name + "调用了子类构造函数");
	}
	
	public void study() {
		System.out.println(name + "在学习");
	}
}