package day03;

public class Demo6 {
	public static void main(String[] args) {
		new Student("LiCheng", "man");
		
	}
}

class Student {
	String name;
	
	String sex;
	
	public Student(String name) {
		this.name = name;
		System.out.println("调用...");
	}
	
	public Student(String name, String sex) {
		this(name);// 调用了一个参数的构造函数
		this.sex = sex;
		System.out.println(this.name + " " + this.sex);
	}
}
