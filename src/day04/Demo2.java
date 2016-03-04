package day04;

public class Demo2 {

	public static void main(String[] args) {
		int[] arr = {1,4,6,33,6,-2};
		ArrayTool.sort(arr);
		String str = ArrayTool.toStrings(arr);
		System.out.println(str);
	}

}

/**
 * 数组工具类
 * @author Shawn
 *
 */
class ArrayTool {
	
	public static String toStrings(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				result += "["+arr[i]+",";
			} else if (i == (arr.length-1)) {
				result += arr[i]+"]";
			} else {
				result += arr[i]+",";
			}
		}
		
		return result;
	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
}
