package day01;

import java.util.Random;
import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("������һ��������");
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int cou = ran.nextInt(10);
		
		while (true) {
			int num = scan.nextInt();
			count++;
			if (num > cou) {
				System.out.println("����");
				//System.out.println("�ٴ����룺");
			} else if (num < cou) {
				System.out.println("С��");
				//System.out.println("�ٴ����룺");
			} else {
				System.out.println("��ȷ");
				break;
			}
			if (count == 2) {
				System.out.println("�㻹��һ�λ���");
			}
			if (count >= 3 && num != cou) {
				System.out.println("����");
				break;
			}
		}
	}
}
