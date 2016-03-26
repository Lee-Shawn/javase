package day25;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		InputStream inputStream = socket.getInputStream();
		byte[] buff = new byte[1024];
		int len = inputStream.read(buff);
		System.out.println(new String(buff, 0, len));
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("server".getBytes());
		outputStream.close();
	}
}
