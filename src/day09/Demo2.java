package day09;

public class Demo2 {
	public static void main(String[] args) {
		Obj obj = new Obj(123, "laughing");
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}

class Obj {
	
	int id;
	
	String name;
	
	public Obj(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * ÷ÿ–¥toString∑Ω∑®
	 */
	public String toString() {
		return "id:" + id + ",name:" + name;
	}
}