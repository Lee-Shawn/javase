package day06;

public class Demo2 {
	public static void main(String[] args) {
		
		Student s = new Student("Mili");
		s.study();
		
		MulStudent m = new MulStudent("Kisa");
		m.getMoney();
		m.study();
	}
}

interface Work {
	
	public void getMoney();
	
}

class Student{
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println(name+"学习");
	}

}

class MulStudent extends Student implements Work {
	
	public MulStudent(String name) {
		super(name);
	}
	
	public void study() {
		System.out.println(name+"不好好学习");
	}
	
	public void getMoney() {
		System.out.println(name+"挣钱");
	}
}