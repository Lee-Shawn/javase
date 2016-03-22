package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/人大萧宇.jpg");
		File cpFile = new File("F:/人大萧宇.jpg");
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(cpFile);
		byte[] b = new byte[1024];
		int length = 0;
		while ((length=in.read(b))!=-1) {
			out.write(b, 0, length);
		}
		out.close();
		in.close();
	}
}
