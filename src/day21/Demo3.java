package day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		File file = new File("E:/人大萧宇.jpg");
		File copy = new File("F:/美女.jpg");
		FileInputStream in = null;
		FileOutputStream on = null;
		BufferedInputStream buffIn = null;
		BufferedOutputStream buffOn = null;
		try {
			in = new FileInputStream(file);
			on = new FileOutputStream(copy);
			buffIn = new BufferedInputStream(in);
			buffOn = new BufferedOutputStream(on);
			int count = 0;
			try {
				while ((count=in.read())!=-1) {
					on.write(count);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				buffOn.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					buffOn.close();
					buffIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
