package day09;

public class Demo9 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "laughing";
		// ��s2���ӵ�s1�ĺ���
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		char[] data = {'e', 'f', 'f', 'e', 'c', 't', 'i', 'v', 'e'};
		// �����ַ������е�ֵ���ַ�����
		String str = String.copyValueOf(data);
		System.out.println(str);
		// ����ָ��λ�õ��ַ����ַ�����
		String s = String.copyValueOf(data, 3, 3);
		System.out.println(s);
		
		String s3 = "abcdefg";
		String s4 = "ABCDEFGABCDEFG";
		// �滻ԭ�ַ����е��ַ���b
		s3 = s3.replace("b", "B");
		System.out.println(s3);
		// �滻ԭ�ַ��������е�A
		s4 = s4.replaceAll("A", "a");
		System.out.println(s4);
	}
}
