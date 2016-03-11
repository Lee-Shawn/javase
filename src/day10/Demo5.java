package day10;

public class Demo5 {
	public static void main(String[] args) {
		
		MyThread m = new MyThread();
		m.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
		}
	}
}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("MyThread:"+i);
		}
	}
}
