package day02;

import java.util.Arrays;

/**
 * ����Ĺ�����
 * @author Shawn
 *
 */
public class Demo9 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 9, 4};
		// ����
		Arrays.sort(arr);
		// ���ֲ���
		int bin = Arrays.binarySearch(arr, 5);
		System.out.println(bin);
		// ��ʾ��������
		String str = Arrays.toString(arr);
		System.out.println(str);
	}
}
