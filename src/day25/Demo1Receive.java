package day25;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1Receive {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		byte[] buff = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
		datagramSocket.receive(datagramPacket);
		System.out.println(new String(buff, 0, datagramPacket.getLength()));
		datagramSocket.close();
	}
}
