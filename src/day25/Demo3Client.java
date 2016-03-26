package day25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Demo3Client {
	public static void main(String[] args) {
		Socket socket = null;
		FileOutputStream fileOutputStream = null;
		try {
			// ����tcp����
			socket = new Socket(InetAddress.getLocalHost(), 9999);
			// ���socket���������ӷ�������ȡ����
			InputStream inputStream = socket.getInputStream();
			// ��ȡ�ļ������������ͼƬ�ӷ�����д���ͻ���
			fileOutputStream = new FileOutputStream("F:/c.jpg");
			// �߶���д
			byte[] buff = new byte[1024];
			int len = 0;
			 while ((len=inputStream.read(buff)) != -1) {
				fileOutputStream.write(buff, 0, len);
			 }
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
