package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		copy();
	}
	
	public static void copy() {
		File file = new File("E:/人大萧宇.jpg");
		File copy = new File("F:/人大.jpg");
		FileInputStream in = null;
		FileOutputStream on = null;
		try {
			in = new FileInputStream(file);
			on = new FileOutputStream(copy);
			byte[] b = new byte[1024];
			int length = 0;
			try {
				while ((length=in.read(b))!=-1) {
					on.write(b, 0, length);
				}
			} catch (IOException e) {
				System.out.println("读取文件失败！");
				throw new RuntimeException(e);
			}
		} catch (IOException e) {
			System.out.println("没有找到文件！");
			throw new RuntimeException(e);
		} finally {
			try {
				if (on != null) {
					on.close();
					System.out.println("关闭输出流成功！");
				}
			} catch (IOException e) {
				System.out.println("关闭输出流失败！");
				throw new RuntimeException(e);
			} finally {
					try {
						if (in != null) {
							in.close();
							System.out.println("关闭输入流成功！");
						}
					} catch (IOException e) {
						System.out.println("关闭输入流失败！");
						throw new RuntimeException(e);
					}
			}
		}
		
	}
}
