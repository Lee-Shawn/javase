package day02;

public class Demo01 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = arr1;
		arr1[1] = 11;
		System.out.println(arr1[1]);
		arr2[1] = 22;
		System.out.println(arr1[1]);
	}
}
