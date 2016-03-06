package day05;

public class Demo1 {
	public static void main(String[] args) {
		
		Circle c = new Circle(6.0);
		c.area();
	}
}

class Circle {
	
	public double r;
	
	public static final double pi = 3.14;
	
	public Circle(double r) {
		this.r = r;
	}
	
	/**
	 * final修饰的方法将不能被子类重写
	 */
	public final void area() {
		System.out.println(pi*r*r);
	}
}
