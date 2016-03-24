package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		mutiMerge();
	}
	
	@SuppressWarnings("resource")
	public static void merge() throws IOException {
		File file1 = new File("F:/a.txt");
		File file2 = new File("F:/b.txt");
		File file3 = new File("F:/c.txt");
		
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		
		FileOutputStream fileOutputStream = new FileOutputStream(file3);
		
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		
		byte[] buff = new byte[1024];
		int len = 0;
		while ((len=sequenceInputStream.read(buff)) != -1) {
			fileOutputStream.write(buff, 0, len);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	
	public static  void mutiMerge() throws IOException {
		File file1 = new File("F:/a.txt");
		File file2 = new File("F:/b.txt");
		File file3 = new File("F:/c.txt");
		File file4 = new File("F:/d.txt");
		
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		FileInputStream fileInputStream3 = new FileInputStream(file3);
		
		FileOutputStream fileOutputStream = new FileOutputStream(file4);
		
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();
		
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		
		byte[] buff = new byte[1024];
		int len = 0;
		
		while ((len=sequenceInputStream.read(buff)) != -1) {
			fileOutputStream.write(buff, 0, len);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
}
