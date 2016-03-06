package day05;

public class Demo3 {
	public static void main(String[] args) {
		
		Circles c = new Circles("圆", 4);
		c.area();
		
		Reatangle r = new Reatangle("矩形", 5, 6);
		r.area();
	}
}

abstract class Picture {
	
	String name;
	
	public Picture(String name) {
		this.name = name;
	}

	public abstract void area();
}

class Circles extends Picture {
	
	public static final double PI = 3.14;
	
	double r;
	
	public Circles(String name, double r) {
		super(name);
		this.r = r;
	}
	
	public void area() {
		System.out.println(name+"的面积："+(PI*r*r));
	}
}

class Reatangle extends Picture {
	
	double length;
	
	double high;
	
	public Reatangle(String name, double length, double high) {
		super(name);
		this.length = length;
		this.high = high;
	}
	
	public void area() {
		System.out.println(name+"的面积："+(length*high));
	}
}