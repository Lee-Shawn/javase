package day01;

public class Demo01 {
	public static void main(String[] args) {
		int a = -124;
		System.out.println(Integer.toBinaryString(a));// �����ڼ�������Բ���ķ�ʽ�洢
		
		byte x = 2;
		byte y = 4;
		byte z = (byte) (x + y);// byte��short��char���͵����ݲ���ʱ�����Զ�ת����int����
		System.out.println(z);
		
		byte i = 10;// ����Ĭ�ϵ�����������int�ͣ�10�ǳ������������ڱ����ʱ���Ѿ�ȷ���˳�����ֵ10û�г���byte�ķ�Χ
		System.out.println(i);
		byte b = i;// ���������е�ʱ��Ż����ڴ��з���ռ�
		System.out.println(b);
	}
}
