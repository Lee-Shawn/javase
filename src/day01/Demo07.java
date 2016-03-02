package day01;

import java.util.Random;
import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int cou = ran.nextInt(10);
		
		while (true) {
			int num = scan.nextInt();
			count++;
			if (num > cou) {
				System.out.println("大了");
				//System.out.println("再次输入：");
			} else if (num < cou) {
				System.out.println("小了");
				//System.out.println("再次输入：");
			} else {
				System.out.println("正确");
				break;
			}
			if (count == 2) {
				System.out.println("你还有一次机会");
			}
			if (count >= 3 && num != cou) {
				System.out.println("结束");
				break;
			}
		}
	}
}
