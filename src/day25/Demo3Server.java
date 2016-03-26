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
			// ��ȡsocket������������ݷ��͵��ͻ���
			OutputStream outputStream = socket.getOutputStream();
			
			// ��ȡͼƬ������������ͼƬ���������
			fileInputStream = new FileInputStream("E:/a.jpg");
			// ��ȡͼƬ����
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
			// �ر���Դ
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
			// ����tcp����
			ServerSocket server = new ServerSocket(9999);
			while (true) {
				// �����û�������
				Socket socket = server.accept();
				new Demo3Server(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
