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
		System.out.println("\r\r\r\r\t\t��ӭʹ���Ͼ���ѧͼ�����ϵͳ\r\r\r\r");
		System.out.println("*******************************************************");
		
		Users user = new Users();
		
		while (true) {
			System.out.println("������ѡ��  (A)�û�ע��     (B)�û���¼    (Q)�˳�ϵͳ");
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
			System.out.println("�������û�����");
			username = scanner.next();
			System.out.println("�������û����룺");
			password = scanner.next();
			map.put(username, password);
			System.out.println("ע��ɹ���");
//			System.out.println(map);
	}
	
	public void logIn() {
		System.out.println("�������û�����");
		String name = scanner.next();
		System.out.println("���������룺");
		String pawd = scanner.next();
		
		boolean isLogin = false;
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (name.equals(entry.getKey()) && pawd.equals(entry.getValue())) {
				isLogin = true;
			}
		}
		
		if (isLogin) {
			System.out.println("��¼�ɹ���");
			System.out.println("��ӭʹ��ͼ�����ϵͳ��");
			System.out.println("��ѡ��(A)�鿴ͼ��	(B)����ͼ��	(C)�޸�ͼ��	(D)ɾ��ͼ��	(E)ע�����û�");
			
			String option = scanner.next();
			if ("A".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("ͼ�������ʱû��ͼ�飡");
				} else {
					book.checkBook();
				}
			} else if ("B".equalsIgnoreCase(option)) {
				
			} else if ("C".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("ͼ�����ʱû��ͼ�飡");
				} else {
					book.updateBook();
				}
			} else if ("D".equalsIgnoreCase(option)) {
				if (book == null) {
					System.out.println("ͼ�����ʱû��ͼ�飡");
				} else {
					book.deleteBook();
				}
			} else if ("E".equalsIgnoreCase(option)) {
				deleteUser();
			}
		} else {
			System.out.println("��¼ʧ�ܣ������µ�¼");
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
//		book.add(new Books("C���Գ������", "̷��ǿ", "�廪��ѧ������", 30.0, "1998-4-21"));
//		book.add(new Books("���ݽṹ", "��ε��", "�廪��ѧ������", 43.0, "2001-4-13"));
		System.out.println("������������");
		String bookName = scanner.next();
		System.out.println("���������ߣ�");
		String bookAuthor = scanner.next();
		System.out.println("����������磺");
		String bookPublish = scanner.next();
		System.out.println("������۸�");
		double bookPrice = scanner.nextDouble();
		System.out.println("���������ʱ�䣺");
		String publishTime = scanner.next();
		
		book.add(new Books(bookName, bookAuthor, bookPublish, bookPrice, publishTime));
		
		System.out.println("��ӳɹ���");
	}
	
	public void updateBook() {
		
	}
	
	public void deleteBook() {
		book.remove(book);
		System.out.println("ɾ���ɹ���");
	}
	
	public void checkBook() {
		System.out.println("����                              ����                          ������                       �۸�                     ����ʱ��");
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