package day08;

public class Demo3 {
	public static void main(String[] args) {
		div(2, 5);
	}
	
	public static void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
			//System.exit(0);// �˳�jvm����ʱfinally�е���䲻��ִ�У���������¶���ִ��
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("ִ��");
		}
	}
}
