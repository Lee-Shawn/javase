package day24;

import java.io.File;

public class Demo5 {
	public static void main(String[] args) {
		File file  = new File("D:/a");
//		dir(file, "");
		delete(file);
	}
	
	public static void dir(File file, String space) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				System.out.println(space+f.getName());
			} else if (f.isDirectory()) {
				System.out.println(space+f.getName());
				dir(f, "  "+space);
			}
		}
	}
	
	public static void delete(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				f.delete();
			} else if (f.isDirectory()) {
				delete(f);
			}
		}
		file.delete();
	}
}
