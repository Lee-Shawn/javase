package day14;

import java.util.LinkedList;
import java.util.Random;

public class Demo3 {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		LinkedList paker = createPaker();
		System.out.println("洗牌前：");
		showPaker(paker);
		shufflePaker(paker);
		System.out.println("洗牌后：");
		showPaker(paker);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static LinkedList createPaker() {
		LinkedList list = new LinkedList();
		String[] color = {"红桃♡", "黑桃♤", "方块♢", "梅花♣"};
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < number.length; j++) {
				list.add(new Paker(color[i], number[j]));
			}
		}
		
		return list;
	}
	
	@SuppressWarnings("rawtypes")
	public static void showPaker(LinkedList paker) {
		for (int i = 0; i < paker.size(); i++) {
			System.out.print(paker.get(i));
			if (i % 13 == 12) {
				System.out.println();
			}
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void shufflePaker(LinkedList paker) {
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			int index1 = random.nextInt(paker.size());
			int index2 = random.nextInt(paker.size());
			Paker p1 = (Paker) paker.get(index1);
			Paker p2 = (Paker) paker.get(index2);
			paker.set(index1, p2);
			paker.set(index2, p1);
		}
	}
}

class Paker {
	
	String color;
	
	String number;
	
	public Paker(String color, String number) {
		this.color = color;
		this.number = number;
	}

	@Override
	public String toString() {
		return "{"+color+number+"}";
	}
}
