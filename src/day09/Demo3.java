package day09;

public class Demo3 {
	public static void main(String[] args) {
		Code c = new Code(123, "kia");
		Code d = new Code(123, "lia");
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}
}

class Code {
	
	int id;
	
	String name;
	
	public Code(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int hashCode() {
		return id;
	}
}