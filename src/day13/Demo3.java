package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Demo3 {
	
	static Scanner scanner = new Scanner(System.in);
	
	@SuppressWarnings("rawtypes")
	static Collection users = new ArrayList();
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("��ѡ��A)ע��    B)��¼    Q)�˳�");
			String option = scanner.next();
			if ("a".equalsIgnoreCase(option)) {
				signup();
			} else if ("b".equalsIgnoreCase(option)) {
				login();
			} else if ("q".equalsIgnoreCase(option)) {
				System.out.println("�˳��ɹ���");
				System.exit(0);
			} else {
				System.out.println("�������,���������룡");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void signup() {
		Users user = null;
		
		while (true) {
			System.out.println("�������˺ţ�");
			int username = scanner.nextInt();
			user = new Users(username, null);
			if (users.contains(user)) {
				System.out.println("�˻����Ѵ��ڣ����������룡");
			} else {
				break;
			}
		}
		
		System.out.println("���������ܣ�");
		String password = scanner.next();
		user.setPassword(password);
		users.add(user);
		System.out.println("ע��ɹ���");
		System.out.println("��ǰϵͳ�е��˻���"+users);
	}
	
	@SuppressWarnings("rawtypes")
	public static void login() {
		System.out.println("�������ʺţ�");
		int username = scanner.nextInt();
		System.out.println("���������ܣ�");
		String password = scanner.next();
		
		Iterator it = users.iterator();
		boolean isLogin = false;
		while (it.hasNext()) {
			Users u = (Users) it.next();
			if (u.getUsername() == username && u.getPassword().equals(password)) {
				isLogin = true;
			}
		}
		
		if (isLogin) {
			System.out.println("��¼�ɹ���");
			System.exit(0);
		} else {
			System.out.println("��¼ʧ��,�����µ�¼��");
		}
	}
}

class Users {
	
	private int username;
	
	private String password;
	
	public Users(int username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		Users user = (Users) obj;
		return this.username == user.username;
	}

	@Override
	public String toString() {
		return "{�ʺţ�" + this.username + ",���룺" + this.password + "}";
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}