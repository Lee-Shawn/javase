package day02;

public class Demo7 {
	public static void main(String[] args) {
		int[] arr = {2,6,7,9,18,25,54,65,93};
		//int result = search(arr, 4);
		//System.out.println("index = " + result);
		int res = binSearch(arr, 9);
		System.out.println(res);
	}
	
	/*
	public static int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	*/
	
	/**
	 * ¶ş·Ö²éÕÒ
	 */
	public static int binSearch(int[] arr, int target) {
		int lower = 0;
		int upper = arr.length-1;
		int mid;
		
		while (lower <= upper) {
			mid = (lower+upper) / 2;
			if (target > arr[mid]) {
				lower = mid + 1;
			} else if (target < arr[mid]) {
				upper = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
