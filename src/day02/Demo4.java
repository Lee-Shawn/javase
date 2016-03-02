package day02;

public class Demo4 {
	public static int arr(int a[]) {
		int max = a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 4, 5, 6, 2};
		int max = arr(a);
		System.out.println("max = " + max);
	}
}
