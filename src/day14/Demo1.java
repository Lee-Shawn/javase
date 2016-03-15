package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("希拉里");
		list.add("特朗普");
		list.add("小布什");
		System.out.println(list);
		
		list.add(3, "奥巴马");
		System.out.println(list);
		
		list.addAll(list);
		System.out.println(list);
	
		boolean b = list.contains("奥巴马");
		System.out.println(b);
		
		System.out.println(list.indexOf("希拉里"));
		
		list.set(3, "克林顿");
		System.out.println(list);
		
		List<String> s = list.subList(0, 3);
		System.out.println(s);
		
		ListIterator<String> li = list.listIterator();
		while (li.hasNext()) {
			li.next();
			li.add("罗斯福");
		}
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
