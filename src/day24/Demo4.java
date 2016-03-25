package day24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo4 {
	public static void main(String[] args) throws IOException {
//		writer();
//		reader();
//		write();
		read();
	}
	
	public static void writer() throws IOException {
		File file = new File("F:/w.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		// 字节流转换成字符流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("计算机");
		outputStreamWriter.close();
	}
	
	public static void reader() throws IOException {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line = null;
		while ((line=bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	public static void write() throws IOException {
		File file = new File("F:/x.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("南京大学计算机研究生");
		outputStreamWriter.close();
	}
	
	public static void read() throws IOException {
		File file  = new File("F:/x.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		char[] buff = new char[1024];
		int len = 0;
		while ((len=inputStreamReader.read(buff)) != -1) {
			System.out.println(new String(buff, 0, len));
		}
		inputStreamReader.close();
	}
}
