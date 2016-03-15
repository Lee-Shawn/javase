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
			System.out.println("请选择：A)注册    B)登录    Q)退出");
			String option = scanner.next();
			if ("a".equalsIgnoreCase(option)) {
				signup();
			} else if ("b".equalsIgnoreCase(option)) {
				login();
			} else if ("q".equalsIgnoreCase(option)) {
				System.out.println("退出成功！");
				System.exit(0);
			} else {
				System.out.println("输入错误,请重新输入！");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void signup() {
		Users user = null;
		
		while (true) {
			System.out.println("请输入账号：");
			int username = scanner.nextInt();
			user = new Users(username, null);
			if (users.contains(user)) {
				System.out.println("账户名已存在！请重新输入！");
			} else {
				break;
			}
		}
		
		System.out.println("请输入秘密：");
		String password = scanner.next();
		user.setPassword(password);
		users.add(user);
		System.out.println("注册成功！");
		System.out.println("当前系统中的账户："+users);
	}
	
	@SuppressWarnings("rawtypes")
	public static void login() {
		System.out.println("请输入帐号：");
		int username = scanner.nextInt();
		System.out.println("请输入秘密：");
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
			System.out.println("登录成功！");
			System.exit(0);
		} else {
			System.out.println("登录失败,请重新登录！");
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
		return "{帐号：" + this.username + ",密码：" + this.password + "}";
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