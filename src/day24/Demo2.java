package day24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		store();
		load();
	}
	
	public static void store() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.setProperty("C++", "1989");
		properties.setProperty("Java", "1995");
		properties.setProperty("Python", "1989");
		properties.store(new FileOutputStream("F:/info.properties"), "Birth-time of the most languges");
	}
	
	public static void load() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileReader("F:/info.properties"));
		Set<Entry<Object, Object>> entry = properties.entrySet();
		for (Entry<Object, Object> e : entry) {
			System.out.println(e);
		}
	}
}
