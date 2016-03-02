package day02;

import java.util.Arrays;

/**
 * 数组的工具类
 * @author Shawn
 *
 */
public class Demo9 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 9, 4};
		// 排序
		Arrays.sort(arr);
		// 二分查找
		int bin = Arrays.binarySearch(arr, 5);
		System.out.println(bin);
		// 显示数组内容
		String str = Arrays.toString(arr);
		System.out.println(str);
	}
}
