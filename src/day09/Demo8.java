package day09;

public class Demo8 {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyzabcdefgabcdefg";
		getCount(s, "b");
	}
	
	/**
	 * ָ���ַ��Ӵ����ַ����г��ֵĴ���
	 */
	public static void getCount(String s, String target) {
		int count = 0;
		// ָ���Ӵ�������
		int fromIndex = 0;
		
		while ((fromIndex = s.indexOf(target, fromIndex)) != -1) {
			count++;
			fromIndex += target.length();
		}
		
		System.out.println(count);
	}
}
