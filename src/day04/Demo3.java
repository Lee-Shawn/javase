package day04;

public class Demo3 {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		System.out.println(s1);
	}
}

/**
 * �������ģʽ����֤һ�������ڴ���ֻ��һ������
 * @author Shawn
 *
 */
class Single {
	
	/**
	 * ˽�л����캯��
	 */
	private Single() {}
	
	/**
	 * ����������������ͱ�����ʹ�øñ���ָ����
	 */
	private static Single s = new Single();
	
	/**
	 * �ṩһ��������̬�ķ�����ȡ�������
	 */
	public static Single getInstance() {
		return s;
	}
	
}