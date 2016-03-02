package day01;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		System.out.println("Input a mouth:");
		Scanner scan = new Scanner(System.in);
		int mouth = scan.nextInt();
		
		switch (mouth) {
		case 3:case 4:case 5:
			System.out.println("Spring");
			break;
		case 6:case 7:case 8:
			System.out.println("Summer");
			break;
		case 9:case 10:case 11:
			System.out.println("April");
			break;
		case 12:case 1:case 2:
			System.out.println("Winter");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
