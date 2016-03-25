package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/pro.properties");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		int count = 0;
		String value = properties.getProperty("count");
		if (value != null) {
			count = Integer.parseInt(value);
		}
		if (count == 3) {
			System.out.println("试用次数已达3次，请购买正版！");
			System.exit(0);
		}
		count++;
		System.out.println("已使用"+count+"次");
		properties.setProperty("count", ""+count);
		properties.store(new FileOutputStream(file), "run");
	}
}
