package day20;

import java.io.File;

public class Demo2 {
	public static void main(String[] args) {
		File file = new File("F:/a");
		System.out.println(file.mkdir());
		File dir = new File("F:/a/b");
		System.out.println(dir.mkdirs());
		System.out.println(dir.delete());
	}
}
