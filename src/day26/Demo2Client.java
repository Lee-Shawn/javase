package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Demo2Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStreamWriter writeOut = null;
		BufferedReader  readIn = null;
		BufferedReader in = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(), 9999);
			writeOut = new OutputStreamWriter(socket.getOutputStream());
			readIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			in = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("��ѡ���ܣ�(A)ע��        (B)��¼        (Q)�˳�");
				String option = in.readLine();
				if ("a".equalsIgnoreCase(option)) {
					selection(writeOut, readIn, in, option);
				} else if ("b".equalsIgnoreCase(option)) {
					selection(writeOut, readIn, in, option);
				} else if ("q".equalsIgnoreCase(option)) {
					System.out.println("�˳�ϵͳ��");
					System.exit(0);
				} else {
					System.out.println("�������");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				readIn.close();
				writeOut.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void selection(OutputStreamWriter writeOut,
			BufferedReader readIn, BufferedReader in, String option)
			throws IOException {
		System.out.println("�������ʺţ�");
		String username = in.readLine();
		System.out.println("���������룺");
		String password = in.readLine();
		String info = option+" "+username+" "+password+"\r\n";
		writeOut.write(info);
		writeOut.flush();
		
		String message = readIn.readLine();
		System.out.println(message);
	}
}
