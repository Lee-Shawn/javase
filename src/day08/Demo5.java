package day08;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		int[] arr = {2, 5, 2, 6, 3, 6, 7};
		System.out.println(Arrays.toString(clearNum(arr)));
	}
	
	public static int[] clearNum(int[] arr) {

		// 数组重复元素的个数
		int count = 0;
		
		// 统计数组中重复元素的个数
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		
		// 新数组的长度
		int newArrLength = arr.length - count;
		int[] newArr= new int[newArrLength];
		
		// 新数组下标
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 拿出旧数组中的元素
			int temp = arr[i];
			// 标记元素是否与新数组中重复
			boolean flag = false;
			
			// 比较数组中的元素是否相同
			for (int j = 0; j < newArr.length; j++) {
				if (temp == newArr[j]) {
					flag = true;
					break;
				}
			}
			
			// 把不重复的元素填入新数组中
			if (flag == false) {
				newArr[index++] = temp;
			}
		}
		
		return newArr;
	}
}
