package day03;

public class Demo2 {
	public static void main(String[] args) {
		Carculator c = new Carculator();
		c.setNum1(5);
		c.setNum2(8);
		c.setControl("/");
		System.out.println(c.result(c.getNum1(), c.getNum2()));
	}
}

class Carculator {
	private double num1;
	private double num2;
	private String control;

	/**
	 * ¼ÆËãÆ÷
	 */
	public double result(double n1, double n2) {
		if (control.equals("+")) {
			return n1+n2;
		} else if (control.equals("-")) {
			return n1-n2;
		} else if (control.equals("*")) {
			return n1*n2;
		} else if (control.equals("/")) {
			return n1/n2;
		} else {
			return -1;
		}
	}
	
	public void setNum1(double num) {
		num1 = num;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum2(double num) {
		num2 = num;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setControl(String con) {
		control = con;
	}
	
	public String getControl() {
		return control;
	}
}