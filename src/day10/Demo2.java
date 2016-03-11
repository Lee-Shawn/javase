package day10;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		
		int[] srcArr = {1,3,5,5,7,3};
		int[] destArr = new int[3];
		
		System.arraycopy(srcArr, 2, destArr, 0, 3);
		System.out.println(Arrays.toString(destArr));
		
		System.out.println(System.currentTimeMillis());
		
//		String value = System.getProperty("os.name");
//		System.out.println(value);
		
		System.exit(0);
	}
}
