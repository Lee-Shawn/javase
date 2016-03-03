package day03;

public class Demo4 {
	public static void main(String[] args) {
		Employee e = new Employee(123, "kris", 30);
		System.out.println(e.id+" "+e.name+" "+e.age);
		new Employee();
	}
}

class Employee {
	int id;
	String name;
	int age;
	
	/**
	 * ¹¹Ôì´úÂë¿é
	 */
	{
		work();
	}
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("working...");
	}
}