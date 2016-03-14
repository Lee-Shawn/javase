package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		UserSystem us = new UserSystem();
		
		while (true) {
			System.out.println("请选择： A.注册      B.登录     Q.退出");
			Scanner s = new Scanner(System.in);
			String str = s.next();
			if ("A".equalsIgnoreCase(str)) {
				us.signUp();
			} else if ("B".equalsIgnoreCase(str)) {
				us.login();
			} else if ("Q".equalsIgnoreCase(str)){
				System.out.println("退出成功!");
				System.exit(0);
			} else {
				System.out.println("输入错误，请重新输入！");
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
			System.out.println("请输入帐号：");
			Scanner scanner = new Scanner(System.in);
			String username = scanner.next();
			user = new User(username, null);
			if (users.contains(user)) {
				System.out.println("该账户已存在，请重新输入！");
			} else {
				break;
			}
		}
		
		System.out.println("请输入密码：");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		user.setPassword(password);
		users.add(user);
		System.out.println("注册成功！");
		System.out.println("当前系统账户："+users);
	}
	
	@SuppressWarnings("rawtypes")
	public void login() {
		System.out.println("请输入帐号：");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		System.out.println("请输入秘密：");
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
			System.out.println("登录成功！");
			System.exit(0);
		} else {
			System.out.println("用户名或密码错误，登录失败！请重新登录!");
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
		return "{帐号：" + this.username + ",密码：" + this.password + "}";
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