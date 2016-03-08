package day07;

public class Demo1 {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.print();
	}
}

abstract class Animal {
	
	public abstract void run();
	
	public abstract void sleep();

}

class Test {
	public void print() {
		/**
		 * 匿名内部类
		 */
		Animal a = new Animal() {
			
			public void run() {
				System.out.println("running...");
			}
			
			public void sleep() {
				System.out.println("sleeping...");
			}
		};
		
		a.run();
		a.sleep();
	}
}