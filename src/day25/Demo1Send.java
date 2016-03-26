package day25;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1Send {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		String data = "UDP test";
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(), 8888);
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}
}
