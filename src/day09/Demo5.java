package day09;

public class Demo5 {
	public static void main(String[] args) {
		String s = "   hello world  ";
		myTrim(s);
	}
	
	public static void myTrim(String s) {
		// 转换成字符数组
		char[] a = s.toCharArray();
		int startindex = 0;
		int endindex = a.length-1;
		
		while (true) {
			if (a[startindex] == ' ') {
				startindex++;
			} else {
				break;
			}
			
			if (a[endindex] == ' ') {
				endindex--;
			} else {
				break;
			}
		}
		
		for (int i = startindex; i <= endindex; i++) {
			System.out.print(a[i]);
		}
	}
}
