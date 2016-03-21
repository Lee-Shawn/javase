package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("F:/a.txt");
		FileInputStream fileInput = new FileInputStream(file);
		/*int con = fileInput.read();
		System.out.println(con);
		fileInput.close();*/
		byte[] b = new byte[10];
		int length = 0;
		while ((length=fileInput.read(b))!=-1) {
			System.out.print(new String(b, 0, length));
		}
	}
}
