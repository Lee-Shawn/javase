package day02;

public class Demo8 {
	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
		reverse(arr);
	}
	
	/**
	 * ÄæÖÃ×Ö·ûÊı×é
	 */
	public static void reverse(char[] arr) {
		int j = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
