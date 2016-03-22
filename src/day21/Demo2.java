package day21;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file  = new File("F:/»À¥Û.jpg");
		FileInputStream in = new FileInputStream(file);
		BufferedInputStream buff = new BufferedInputStream(in);
		int count = 0;
		while ((count=in.read())!=-1) {
			System.out.println(count);
		}
		buff.close();
	}
}
