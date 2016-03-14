package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		UserSystem us = new UserSystem();
		
		while (true) {
			System.out.println("��ѡ�� A.ע��      B.��¼     Q.�˳�");
			Scanner s = new Scanner(System.in);
			String str = s.next();
			if ("A".equalsIgnoreCase(str)) {
				us.signUp();
			} else if ("B".equalsIgnoreCase(str)) {
				us.login();
			} else if ("Q".equalsIgnoreCase(str)){
				System.out.println("�˳��ɹ�!");
				System.exit(0);
			} else {
				System.out.println("����������������룡");
			}
			
		}
	}
}

class UserSystem {
	
	User user = null;
	
	@SuppressWarnings("rawtypes")
	Collection users = new ArrayList();
	
	@SuppressWarnings("unchecked")
	public void signUp() {
		while (true) {
			System.out.println("�������ʺţ�");
			Scanner scanner = new Scanner(System.in);
			String username = scanner.next();
			user = new User(username, null);
			if (users.contains(user)) {
				System.out.println("���˻��Ѵ��ڣ����������룡");
			} else {
				break;
			}
		}
		
		System.out.println("���������룺");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		user.setPassword(password);
		users.add(user);
		System.out.println("ע��ɹ���");
		System.out.println("��ǰϵͳ�˻���"+users);
	}
	
	@SuppressWarnings("rawtypes")
	public void login() {
		System.out.println("�������ʺţ�");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		System.out.println("���������ܣ�");
		String password = scanner.next();
		
		boolean isLogin = false;
		Iterator it = users.iterator();
		while (it.hasNext()) {
			User u = (User) it.next();
			if (u.getPassword().equals(username) && u.getUsername().equals(password)) {
				isLogin = true; 
			}
		}
		if (isLogin) {
			System.out.println("��¼�ɹ���");
			System.exit(0);
		} else {
			System.out.println("�û�����������󣬵�¼ʧ�ܣ������µ�¼!");
			login();
		}
	}
}

class User {
	
	private String username;
	
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String toString() {
		return "{�ʺţ�" + this.username + ",���룺" + this.password + "}";
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return this.username == user.username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}