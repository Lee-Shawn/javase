package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3Server extends Thread {
	
	Socket socket;
	
	public Demo3Server(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		FileInputStream fileInputStream = null;
		try {
			// 获取socket输出流，把数据发送到客户端
			OutputStream outputStream = socket.getOutputStream();
			
			// 获取图片的输入流，把图片读入服务器
			fileInputStream = new FileInputStream("E:/a.jpg");
			// 读取图片数据
			byte[] buff = new byte[1024];
			int len = 0;
			while ((len=fileInputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, len);
			}
			String ip = socket.getInetAddress().getHostAddress();
			System.out.println("Download ip:"+ip);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				fileInputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			// 建立tcp服务
			ServerSocket server = new ServerSocket(9999);
			while (true) {
				// 接收用户的连接
				Socket socket = server.accept();
				new Demo3Server(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
