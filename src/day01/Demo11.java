package day01;

public class Demo11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 99) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
