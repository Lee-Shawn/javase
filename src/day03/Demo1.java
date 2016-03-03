package day03;

public class Demo1 {
	public static void main(String[] args) {
		Mumber m = new Mumber();
		m.name = "ÌÇÌÇ";
		m.setSex("Å®");
		m.salary = 9000;
		System.out.println(m.name + m.getSex() + m.salary);
	}
}

class Mumber {
	public String name;
	private String sex;
	public int salary;
	
	public void setSex(String s) {
		if (s.equals("ÄÐ") || s.equals("Å®")) {
			sex = s;
		} else {
			sex = "ÄÐ";
		}
	}
	
	public String getSex() {
		return sex;
	}
}