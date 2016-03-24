package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		cut();
		merger();
	}
	
	public static void cut() throws IOException {
		File file = new File("F:/∫√œÎƒ„.mp3");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		byte[] buff = new byte[1024*1024];
		int len = 0;
		for (int i = 0; (len=fileInputStream.read(buff))!=-1; i++) {
			FileOutputStream fileOutputStream = new FileOutputStream(new File("F:/"+i+".mp3"));
			fileOutputStream.write(buff, 0, len);
			fileOutputStream.close();
		}
		fileInputStream.close();
	}
	
	public static void merger() throws IOException {
		File file1 = new File("F:/0.mp3");
		File file2 = new File("F:/1.mp3");
		File file3 = new File("F:/2.mp3");
		File file4 = new File("F:/miss.mp3");
		
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		FileInputStream fileInputStream3 = new FileInputStream(file3);
		
		FileOutputStream fileOutputStream = new FileOutputStream(file4);
		
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream3);
		vector.add(fileInputStream2);
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
