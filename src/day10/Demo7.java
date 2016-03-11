package day10;

public class Demo7 {
	public static void main(String[] args) {
		
		Acount h = new Acount("老公");
		Acount w = new Acount("老婆");
		h.start();
		w.start();
	}
}

class Acount extends Thread {

	public static int money = 5000;
	
	static Object obj = new Object();
	
	public Acount(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (money > 0) {
			synchronized (obj) {
				money -= 1000;
				if (money <= 0) {
					System.out.println(Thread.currentThread().getName()+"想取钱，账户余额不足！");
					break;
				}
				System.out.println(Thread.currentThread().getName()+"取了1000块，还剩" + money + "块");
			}
		}
	}
}