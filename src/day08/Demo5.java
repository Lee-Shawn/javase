package day08;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		int[] arr = {2, 5, 2, 6, 3, 6, 7};
		System.out.println(Arrays.toString(clearNum(arr)));
	}
	
	public static int[] clearNum(int[] arr) {

		// �����ظ�Ԫ�صĸ���
		int count = 0;
		
		// ͳ���������ظ�Ԫ�صĸ���
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		
		// ������ĳ���
		int newArrLength = arr.length - count;
		int[] newArr= new int[newArrLength];
		
		// �������±�
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// �ó��������е�Ԫ��
			int temp = arr[i];
			// ���Ԫ���Ƿ������������ظ�
			boolean flag = false;
			
			// �Ƚ������е�Ԫ���Ƿ���ͬ
			for (int j = 0; j < newArr.length; j++) {
				if (temp == newArr[j]) {
					flag = true;
					break;
				}
			}
			
			// �Ѳ��ظ���Ԫ��������������
			if (flag == false) {
				newArr[index++] = temp;
			}
		}
		
		return newArr;
	}
}
