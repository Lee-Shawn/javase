package day17;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo5 {
	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		System.out.println("*******************************************************");
		System.out.println("\r\r\r\r\t\t欢迎使用南京大学图书管理系统\r\r\r\r");
		System.out.println("*******************************************************");
		
		Users user = new Users();
		
		while (true) {
			System.out.println("请输入选择  (A)用户注册     (B)用户登录    (Q)退出系统");
			Scanner scanner = new Scanner(System.in);
			String option = scanner.next();
			if ("A".equalsIgnoreCase(option)) {
				user.signUp();
			} else if ("B".equalsIgnoreCase(option)) {
				user.logIn();
			} else if ("Q".equalsIgnoreCase(option)) {
				System.exit(0);
			}
		}
	}
}

class Users {
	
	String username;
	
	String password;
	
	Map<String, String> map = new TreeMap<String, String>();
	
	Scanner scanner = new Scanner(System.in);
	
	Books book;
	
	public void signUp() {
			System.out.println("请输入用户名：");
			username = scanner.next();
			System.out.println("请输入用户密码：");
			password = scanner.next();
			map.put(username, password);
			System.out.println("注册成功！");
//			System.out.println(map);
	}
	
	public void logIn() {
		System.out.println("请输入用户名：");
		String name = scanner.next();
		System.out.println("请输入密码：");
		String pawd = scanner.next();
		
		boolean isLogin = false;
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (name.equals(entry.getKey()) && pawd.equals(entry.getValue())) {
				isLogin = true;
			}
		}
		
		if (isLogin) {
			System.out.println("登录成功！");
			System.out.println("欢迎使用图书管理系统！");
			System.out.println("请选择：(A)查看图书	(B)增加图书	(C)修改图书	(D)删除图书	(E)注销本用户");
			
			String option = scanner.next();
			if ("A".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("图书馆中暂时没有图书！");
				} else {
					book.checkBook();
				}
			} else if ("B".equalsIgnoreCase(option)) {
				
			} else if ("C".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("图书馆暂时没有图书！");
				} else {
					book.updateBook();
				}
			} else if ("D".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("图书馆暂时没有图书！");
				} else {
					book.deleteBook();
				}
			} else if ("E".equalsIgnoreCase(option)) {
				deleteUser();
			}
		} else {
			System.out.println("登录失败！请重新登录");
		}
	}
	
	public void deleteUser() {
		
	}
}

class Books {
	
	private String bookName;
	
	private String bookAuthor;
	
	private String bookPublish;
	
	private double bookPrice;
	
	private String publishTime;
	
	TreeSet<Books> book = new TreeSet<Books>();
	
	Scanner scanner = new Scanner(System.in);
	
	public Books(String bookName, String bookAuthor, 
			String bookPublish, double bookPrice, String publishTime) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
		this.publishTime = publishTime;
	}
	
	public void addBook() {
//		book.add(new Books("C语言程序设计", "谭浩强", "清华大学出版社", 30.0, "1998-4-21"));
//		book.add(new Books("数据结构", "严蔚敏", "清华大学出版社", 43.0, "2001-4-13"));
		System.out.println("请输入书名：");
		String bookName = scanner.next();
		System.out.println("请输入作者：");
		String bookAuthor = scanner.next();
		System.out.println("请输入出版社：");
		String bookPublish = scanner.next();
		System.out.println("请输入价格：");
		double bookPrice = scanner.nextDouble();
		System.out.println("请输入出版时间：");
		String publishTime = scanner.next();
		
		book.add(new Books(bookName, bookAuthor, bookPublish, bookPrice, publishTime));
		
		System.out.println("添加成功！");
	}
	
	public void updateBook() {
		
	}
	
	public void deleteBook() {
		book.remove(book);
		System.out.println("删除成功！");
	}
	
	public void checkBook() {
		System.out.println("书名                              作者                          出版社                       价格                     出版时间");
		System.out.print(bookName+"\t"+bookAuthor+"\t"+bookPublish+"\t"+bookPrice+"\t"+publishTime);
		System.out.println();
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublish() {
		return bookPublish;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
}