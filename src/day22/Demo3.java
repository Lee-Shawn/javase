package day22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		copyFile();
	}
	
	public static void copyFile() throws IOException {
		File file = new File("F:/a.txt");
		File copy = new File("E:/c.txt");
		FileReader fileReader = new FileReader(file);
		FileWriter fileWriter = new FileWriter(copy);
		char[] buff = new char[1024];
		int len = 0;
		while ((len=fileReader.read(buff))!=-1) {
			fileWriter.write(buff, 0, len);
		}
		fileWriter.close();
		fileReader.close();
	}
}
