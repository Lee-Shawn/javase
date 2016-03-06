package day05;

public class Demo2 {
	public static void main(String[] args) {
		
		Dog d = new Dog("�ϵ�", "��ɫ");
		d.run();
	}
}

abstract class Animal {
	
	String name;
	
	String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	/**
	 * ���󷽷�
	 */
	public abstract void run();
}

class Dog extends Animal {
	
	public Dog(String name, String color) {
		super(name, color);
	}
	
	public void run() {
		System.out.println(name+"��");
	}
}

class Fish extends Animal {
	
	public Fish(String name, String color) {
		super(name, color);
	}
	
	public void run() {
		System.out.println(name+"��");
	}
}