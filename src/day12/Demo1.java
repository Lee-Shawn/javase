package day12;

public class Demo1 {
	public static void main(String[] args) {
		Product p = new Product();
		Consumer consumer = new Consumer(p);
		Producer producer = new Producer(p);
		consumer.start();
		producer.start();
	}
}

class Product {
	
	String name;
	
	double price;
	
	boolean flag;
}

class Consumer extends Thread {
	
	Product p;
	
	public Consumer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (p.flag) {
					System.out.println("消费者消费了一斤"+p.price+"的元的"+p.name);
					p.flag = false;
					p.notify();
				} else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Producer extends Thread {
	
	Product p;
	
	public Producer(Product p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		int i = 0;
		
		while (true) {
			synchronized (p) {
				if (p.flag == false) {
					if (i % 2 == 0) {
						p.name = "苹果";
						p.price = 8.2;
					} else {
						p.name = "橘子";
						p.price = 6.2;
					}
					System.out.println("生产者生产了一斤"+p.price+"元的"+p.name);
					p.flag = true;
					i++;
					p.notify();
				} else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}