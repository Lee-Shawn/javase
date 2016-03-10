package day09;

public class Demo8 {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyzabcdefgabcdefg";
		getCount(s, "b");
	}
	
	/**
	 * 指定字符子串在字符串中出现的次数
	 */
	public static void getCount(String s, String target) {
		int count = 0;
		// 指定子串的索引
		int fromIndex = 0;
		
		while ((fromIndex = s.indexOf(target, fromIndex)) != -1) {
			count++;
			fromIndex += target.length();
		}
		
		System.out.println(count);
	}
}
