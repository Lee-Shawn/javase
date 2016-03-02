package day01;

public class Demo14 {
	public static void mulTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		mulTable();
	}
}
