package day10;

public class Demo6 extends Thread {
	
	public static void main(String[] args) {
		Demo6 d = new Demo6("thread");
//		System.out.println(d.getName());
//		d.setName("tx");
		d.setPriority(8);
		d.start();
		
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
	
	public Demo6(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
