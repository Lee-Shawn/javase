package day20;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		//File file = new File("E:\\Code");
		//File file = new File("E:/Code");
		File file = new File("E:"+File.separator+"Code");
		System.out.println("ÎÄ¼þ¼Ð´æÔÚ£¿"+file.exists());
	}
}

