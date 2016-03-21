package day20;

import java.io.File;
import java.io.FileOutputStream;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/a.txt");
		FileOutputStream out = new FileOutputStream(file, true);
		String data = "…Ÿ ±À– ´ È";
		out.write(data.getBytes());
		out.close();
	}
}
