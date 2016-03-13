package day12;

public class Demo3 {
	public static void main(String[] args) {
		Pool pool = new Pool();
		Input input = new Input(pool);
		Output output = new Output(pool);
		input.start();
		output.start();
	}
}

class Input extends Thread {
	
	Pool pool;
	
	public Input(Pool pool) {
		this.pool = pool;
	}
	
	public void run() {
		while (pool.vector < 500) {
			synchronized (pool) {
				pool.vector += 5;
				if (pool.vector >= 500) {
					System.out.println("ˮ������������");
					pool.vector = 500;
					break;
				}
				System.out.println("עˮ5L,ˮ������"+pool.vector+"Lˮ...");
			}
		}
	}
}

class Output extends Thread {
	
	Pool pool;
	
	public Output(Pool pool) {
		this.pool = pool;
	}
	
	public void run() {
		while (pool.vector > 0) {
			synchronized (pool) {
				pool.vector -= 2;
				if (pool.vector <= 0) {
					System.out.println("ˮ���Ѹ�!!!");
					pool.vector = 0;
					break;
				}
				System.out.println("��ˮ2L,ˮ������"+pool.vector+"Lˮ...");
			}
		}
	}
}

class Pool {
	
	int vector = 100;
}