package day04;

public class Demo4 {
	public static void main(String[] args) {
		Single2 s1 = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
}

/**
 * ÀÁººµ¥ÀýÄ£Ê½
 * @author Shawn
 *
 */
class Single2 {
	
	private static Single2 s;
	
	private Single2() {}
	
	public static Single2 getInstance() {
		if (s == null) {
			s = new Single2();
		}
		return s;
	}
	
}