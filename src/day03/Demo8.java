package day03;

public class Demo8 {
	public static void main(String[] args) {
		new Emp();
		new Emp();
		new Emp().showCount();
	}
}

/**
 * ͳ�ƶ��󴴽��Ĵ���
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
