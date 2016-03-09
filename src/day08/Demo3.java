package day08;

public class Demo3 {
	public static void main(String[] args) {
		div(2, 5);
	}
	
	public static void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
			//System.exit(0);// 退出jvm，此时finally中的语句不会执行，其他情况下都会执行
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("执行");
		}
	}
}
