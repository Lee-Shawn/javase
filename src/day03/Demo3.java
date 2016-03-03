package day03;

public class Demo3 {
	public static void main(String[] args) {
		int[] arr = {0, 0, 12, 1, 16, 0};
		int[] a = save(arr);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] save(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		int[] newArr = new int[arr.length-count];
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		return newArr;
	}
}
