package day03;

public class Demo1 {
	public static void main(String[] args) {
		Mumber m = new Mumber();
		m.name = "����";
		m.setSex("Ů");
		m.salary = 9000;
		System.out.println(m.name + m.getSex() + m.salary);
	}
}

class Mumber {
	public String name;
	private String sex;
	public int salary;
	
	public void setSex(String s) {
		if (s.equals("��") || s.equals("Ů")) {
			sex = s;
		} else {
			sex = "��";
		}
	}
	
	public String getSex() {
		return sex;
	}
}