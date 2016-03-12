package day11;

public class Demo1 {
	
	private String name;
	
	private String sex;
	
	private int age;
	
	public Demo1() {}
	
	public String eat(String food) {
		return "I'm eating " + food;
	}
	
	public void tea() {
		System.out.println("I'm drinking tea...");
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.name);
		System.out.println(d.sex);
		System.out.println(d.age);
		String s = d.eat("KFC");
		System.out.println(s);
	}
}
