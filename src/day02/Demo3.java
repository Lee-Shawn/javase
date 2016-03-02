package day02;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		// 动态初始化
		int[] a = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			System.out.println(a[i]);
		}
		//静态初始化
		int[] b = {1,2,3,4,5};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
