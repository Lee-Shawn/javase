package day20;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		File file = new File("E:\\Code\\Java\\Servlet\\myservlet");
		File[] f = file.listFiles();
		for (File files : f) {
			String fileName = files.getName();
			if (fileName.endsWith(".java")) {
				System.out.println("���е�java�ļ���"+files.getName());
			}
		}
		
		for (File dir : f) {
			if (dir.isDirectory()) {
				System.out.println("�ļ��У�"+dir.getName());
			} else {
				System.out.println("�ļ���"+dir.getName());
			}
		}
	}
}
