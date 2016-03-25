package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		write();
		read();
	}
	
	public static void write() throws IOException {
		User user = new User("laughing", "yun&forever");
		File file = new File("F:/object.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
	}
	
	public static void read() throws IOException, ClassNotFoundException {
		File file = new File("F:/object.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		User user = (User)objectInputStream.readObject();
		System.out.println(user);
		objectInputStream.close();
	}
}

class User implements Serializable {

	/**
	 * 指定序列
	 */
	private static final long serialVersionUID = 1L;

	String name;
	
	String password;
	
	public User(String name, String password) {
		this.name = name;;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "用户名：" + this.name + " 密码：" + this.password;
	}
}
