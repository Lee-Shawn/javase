package day06;

public class Demo1 {
	public static void main(String[] args) {

		Mouse m = new Mouse("雷蛇");
		m.connect();
		
		Keyboard k = new Keyboard("机械");
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
		System.out.println(name+"鼠标连接了电脑");
	}
}

class Keyboard implements USB {
	
	String name;
	
	public Keyboard(String name) {
		this.name = name;
	}
	
	public void connect() {
		System.out.println(name+"键盘连接了电脑");
	}
}
