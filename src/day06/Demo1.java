package day06;

public class Demo1 {
	public static void main(String[] args) {

		Mouse m = new Mouse("����");
		m.connect();
		
		Keyboard k = new Keyboard("��е");
		k.connect();
	}
}

interface USB {
	
	public void connect();
}

class Mouse implements USB {
	
	String name;
	
	public Mouse(String name) {
		this.name = name;
	}
	
	public void connect() {
		System.out.println(name+"��������˵���");
	}
}

class Keyboard implements USB {
	
	String name;
	
	public Keyboard(String name) {
		this.name = name;
	}
	
	public void connect() {
		System.out.println(name+"���������˵���");
	}
}
