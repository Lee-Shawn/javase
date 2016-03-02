package day01;

import java.util.Random;

public class Demo05 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(21);// 产生0-20之间的随机数
		System.out.println(num);
	}
}
