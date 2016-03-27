package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Demo1Server extends Thread {
	
	Socket socket;
	
	public static File file = new File("F:/user.properties");
	
	public Demo1Server(Socket socket) {
		this.socket = socket;
	}
	
	static {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				BufferedReader readIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				OutputStreamWriter writeOut = new OutputStreamWriter(socket.getOutputStream());
				
				String info = readIn.readLine();
				String[] data = info.split(" ");
				String option = data[0];
				String username = data[1];
				String password = data[2];
				if ("a".equalsIgnoreCase(option)) {
					Properties properties = new Properties();
					properties.load(new FileReader(file));
					// 判断用户名是否已经注册
					if (!properties.containsKey(username)) {
						properties.setProperty(username, password);
						properties.store(new FileWriter(file), "user");
						writeOut.write("注册成功！\r\n");
					} else {
						writeOut.write("用户名已存在，请重新注册！\r\n");
					}
					writeOut.flush();
				} else if ("b".equalsIgnoreCase(option)) {
					Properties properties = new Properties();
					properties.load(new FileReader(file));
					if (properties.containsKey(username)) {
						String pawd = properties.getProperty(username);
						if (password.equals(pawd)) {
							writeOut.write("登录成功！\r\n");
						} else {
							writeOut.write("密码错误！\r\n");
						}
					} else {
						writeOut.write("用户不存在！\r\n");
					}
					writeOut.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		while (true) {
			Socket socket = server.accept();
			new Demo1Server(socket).start();
		}
	}
}
