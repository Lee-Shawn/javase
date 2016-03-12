package day11;

public class Demo2 {
	
	private String name;
	
	private String sex;
	
	private int age;
	
	public Demo2(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Demo2 d = new Demo2("swift", "woman", 26);
		System.out.println(d.name + d.sex + d.age);
	}
}
