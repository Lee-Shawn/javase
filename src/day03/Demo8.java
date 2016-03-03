package day03;

public class Demo8 {
	public static void main(String[] args) {
		new Emp();
		new Emp();
		new Emp().showCount();
	}
}

/**
 * 统计对象创建的次数
 * @author Shawn
 *
 */
class Emp {
	static int count = 0;

	{
		count++;
	}
	
	public Emp() {
		
	}
	
	public void showCount() {
		System.out.println(count);
	}
}
