package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Demo1Client {
	
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(), 8888);
			OutputStreamWriter writeOut = new OutputStreamWriter(socket.getOutputStream());
			BufferedReader readIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("��ѡ���ܣ�(A)ע��        (B)��¼");
				String option = bufferedReader.readLine();
				if ("a".equalsIgnoreCase(option)) {
					System.out.println("�������ʺţ�");
					String username = bufferedReader.readLine();
					System.out.println("���������룺");
					String password = bufferedReader.readLine();
					String info = option + " " + username + " " + password+"\r\n";
					writeOut.write(info);
					writeOut.flush();
					
					String line = readIn.readLine();
					System.out.println(line);
				} else if ("b".equalsIgnoreCase(option)) {
					System.out.println("�������ʺţ�");
					String username = bufferedReader.readLine();
					System.out.println("���������룺");
					String password = bufferedReader.readLine();
					String info = option + " " + username + " " + password+"\r\n";
					writeOut.write(info);
					writeOut.flush();
					
					String line = readIn.readLine();
					System.out.println(line);
				} else if ("q".equalsIgnoreCase(option)) {
					System.out.println("ϵͳ�˳���");
					System.exit(0);
				} else {
					System.out.println("�������");
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
