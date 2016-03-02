package day02;

public class Demo11 {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		car.setName("BMW");
		car.setColor("Red");
		car.setWheel(4);
		System.out.println(car.getName() + " " + car.getColor() + " " + car.getWheel());
	}
}

class Car {
	
	public String name;
	public String color;
	public int wheel;
	
	public void run() {
		System.out.println("running...");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public int getWheel() {
		return wheel;
	}
}
