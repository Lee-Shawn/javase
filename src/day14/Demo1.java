package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ϣ����");
		list.add("������");
		list.add("С��ʲ");
		System.out.println(list);
		
		list.add(3, "�°���");
		System.out.println(list);
		
		list.addAll(list);
		System.out.println(list);
	
		boolean b = list.contains("�°���");
		System.out.println(b);
		
		System.out.println(list.indexOf("ϣ����"));
		
		list.set(3, "���ֶ�");
		System.out.println(list);
		
		List<String> s = list.subList(0, 3);
		System.out.println(s);
		
		ListIterator<String> li = list.listIterator();
		while (li.hasNext()) {
			li.next();
			li.add("��˹��");
		}
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
