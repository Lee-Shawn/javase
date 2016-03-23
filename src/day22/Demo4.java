package day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
	public static void readLine() throws IOException {
		File file = new File("E:\\Code\\Java\\Eclipse4.3\\Itcast\\src\\day22\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fileReader);
		String line = null;
		while ((line=buffer.readLine()) != null) {
			System.out.println(line);
		}
		buffer.close();
	}
	
	public static void main(String[] args) throws IOException {
		readLine();
	}
}