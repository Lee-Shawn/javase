package day22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		write();
	}
	
	public static void write() throws IOException {
		File file = new File("F:/a.txt");
		FileWriter fileWrite = new FileWriter(file);
		String data = "数据结构与算法分析";
		fileWrite.write(data);
		fileWrite.flush();
		fileWrite.close();
	}
}
