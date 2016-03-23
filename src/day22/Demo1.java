package day22;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		buff();
	}
	
	public static void read() throws IOException {
		File file = new File("F:/a.txt");
		FileReader fileReader = new FileReader(file);
		int con = 0;
		while ((con=fileReader.read())!=-1) {
			System.out.print((char)con);
		}
		fileReader.close();
	}
	
	public static void buff() throws IOException {
		File file = new File("F:/a.txt");
		FileReader fileReader = new FileReader(file);
		char[] buff = new char[1024];
		int length = 0;
		while ((length=fileReader.read(buff))!=-1) {
			System.out.println(new String(buff, 0, length));
		}
		fileReader.close();
	}
}
