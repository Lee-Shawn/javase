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
		File file = new File("E:/�˴�����.jpg");
		File copy = new File("F:/�˴�.jpg");
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
				System.out.println("��ȡ�ļ�ʧ�ܣ�");
				throw new RuntimeException(e);
			}
		} catch (IOException e) {
			System.out.println("û���ҵ��ļ���");
			throw new RuntimeException(e);
		} finally {
			try {
				if (on != null) {
					on.close();
					System.out.println("�ر�������ɹ���");
				}
			} catch (IOException e) {
				System.out.println("�ر������ʧ�ܣ�");
				throw new RuntimeException(e);
			} finally {
					try {
						if (in != null) {
							in.close();
							System.out.println("�ر��������ɹ���");
						}
					} catch (IOException e) {
						System.out.println("�ر�������ʧ�ܣ�");
						throw new RuntimeException(e);
					}
			}
		}
		
	}
}
