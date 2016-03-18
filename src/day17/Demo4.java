package day17;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("«Î ‰»ÎQQ” œ‰£∫");
			String s = scanner.next();
			System.out.println(s.matches("[0-9]\\d{1,9}@[a-z]\\w{1,9}.com") ? "success" : "unsuccess");
		}
	}
}
