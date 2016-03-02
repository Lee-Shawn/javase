package day02;

public class Demo6 {
	public static void main(String[] args) {
		int[] arr = {2,5,6,8,9,3,-2,6};
		bubbleSort(arr);
	}
	
	/**
	 * ц╟ещеепР
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
