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
			// 建立tcp服务
			socket = new Socket(InetAddress.getLocalHost(), 9999);
			// 获得socket输入流，从服务器读取数据
			InputStream inputStream = socket.getInputStream();
			// 获取文件的输出流，把图片从服务器写到客户端
			fileOutputStream = new FileOutputStream("F:/c.jpg");
			// 边读边写
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
