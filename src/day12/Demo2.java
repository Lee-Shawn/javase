package day12;

public class Demo2 {
	public static void main(String[] args) {
		MyThread m = new MyThread("mth");
		m.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			if (i == 80) {
				m.flag = false;
				synchronized (m) {
					m.notify();
				}
			}
		}
	}
}

class MyThread extends Thread {
	
	String name;
	
	boolean flag = true;
	
	public MyThread(String name) {
		super(name);
	}
	
	public synchronized void run() {
		int i = 1;
		while (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			i++;
		}
	}
}