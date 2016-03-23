package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("��ѡ��(A)ע��         (B)��¼       (Q)�˳�");
			Scanner scanner = new Scanner(System.in);
			String option = scanner.next();
			if ("A".equalsIgnoreCase(option)) {
				signUp();
			} else if ("B".equalsIgnoreCase(option)) {
				logIn();
			} else if ("Q".equalsIgnoreCase(option)) {
				System.exit(0);
			} else {
				System.out.println("�������");
			}
		}
	}
	
	public static void signUp() throws IOException {
		File file = new File("F:/user.txt");
		FileWriter fielWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fielWriter);
		System.out.println("�������ʺţ�");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("���������룺");
		String pawd = scanner.next();
		bufferedWriter.write(name);
		bufferedWriter.write(" ");
		bufferedWriter.write(pawd);
		bufferedWriter.newLine();
		bufferedWriter.close();
		System.out.println("ע��ɹ���");
	}
	
	public static void logIn() throws IOException {
		File file = new File("F:user.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println("�������ʺţ�");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("���������룺");
		String pawd = scanner.next();
		String info = name + " " + pawd;
		String line = null;
		boolean isLogin = false;
		while((line=bufferedReader.readLine())!=null) {
			if (info.equals(line)) {
				isLogin = true;
				break;
			}
		}
		if (isLogin) {
			System.out.println("��¼�ɹ���");
		} else {
			System.out.println("��¼ʧ�ܣ�");
		}
		bufferedReader.close();
	}
}
