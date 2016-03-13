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
					System.out.println("水池已满！！！");
					pool.vector = 500;
					break;
				}
				System.out.println("注水5L,水池中有"+pool.vector+"L水...");
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
					System.out.println("水池已干!!!");
					pool.vector = 0;
					break;
				}
				System.out.println("放水2L,水池中有"+pool.vector+"L水...");
			}
		}
	}
}

class Pool {
	
	int vector = 100;
}