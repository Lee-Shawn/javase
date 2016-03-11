package day10;

import java.util.Random;

public class Demo4 {
	public static void main(String[] args) {
		char[] ch = {'X', 'j', 's', 'K', '8', '2', 'D'};
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(ch.length);
			sb.append(ch[index]);
		}
		
		System.out.println(sb);
	}
}
