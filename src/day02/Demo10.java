package day02;

public class Demo10 {
	public static void main(String[] args) {
		int[][] arr = {{3, 5, 2}, {4, 66, 2, 64}, {3,4}};
		
		// ������ά����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}
}
