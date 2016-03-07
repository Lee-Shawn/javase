package day06;

public class Demo3 {
	public static void main(String[] args) {
		
		Game g = getGame(1);
		print(g);
	}
	
	public static void print(Game g) {
		g.run();
		g.skill();
	}
	
	public static Game getGame(int i) {
		if (i == 0) {
			return new CF();
		} else {
			return new DNF();
		}
	}
}

abstract class Game {
	
	public abstract void run();
	
	public abstract void skill();
}

class CF extends Game {
	
	public CF() {
		
	}

	@Override
	public void run() {
		System.out.println("CFers running...");
	}

	@Override
	public void skill() {
		System.out.println("CFers shutting...");
	}
}

class DNF extends Game {
	
	public DNF() {
		
	}

	@Override
	public void run() {
		System.out.println("DNFers running...");
	}

	@Override
	public void skill() {
		System.out.println("DNFers cutting...");
	}
}
