package day09;

public class Demo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		// s1,s2��ָ�������е�ͬһ���ַ���
		System.out.println("s1==s2?"+(s1==s2));

		// s2,s3,s4���ڴ��ַ��ͬ
		System.out.println("s2==s3?"+(s2==s3));
		System.out.println("s3==s4?"+(s3==s4));
		
		// String����д��equals�������Ƚϵ����������������
		System.out.println("s3equals(s4)?"+s3.equals(s4));
		
		// �����s.euqals("hello")��string�д�null����ֿ�ָ�����
		string(null);
	}
	
	public static void string(String s) {
		// ͨ�����ַ�������������equals������������ֿ�ָ��
		if ("hello".equals(s)) {
			System.out.println("��ͬ");
		} else {
			System.out.println("��ͬ");
		}
	}
}
