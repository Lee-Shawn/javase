package day03;

public class Demo5 {
	Demo5() {
		i = 4;
	}
	
	{
		i = 1;
	}
	
	int i = 2;
	
	public static void main(String[] args) {
		Demo5 d = new Demo5();
		System.out.println(d.i);
	}
}
