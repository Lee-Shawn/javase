package day10;

public class Demo7 {
	public static void main(String[] args) {
		
		Acount h = new Acount("�Ϲ�");
		Acount w = new Acount("����");
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
					System.out.println(Thread.currentThread().getName()+"��ȡǮ���˻����㣡");
					break;
				}
				System.out.println(Thread.currentThread().getName()+"ȡ��1000�飬��ʣ" + money + "��");
			}
		}
	}
}