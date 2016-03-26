package day25;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Demo2Client {
	public static void main(String[] args) throws IOException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("sokcet".getBytes());
		socket.close();
	}
}
