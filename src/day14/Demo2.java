package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Book(1, "thinking in java"));
		list.add(new Book(2, "core java"));
		list.add(new Book(1, "java"));
		System.out.println(list);
		
		ArrayList al = clear(list);
		System.out.println(al);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList clear(ArrayList list) {
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (!newList.contains(book)) {
				newList.add(book);
			}
		}
		
		return newList;
	}
}

class Book {
	
	int id;
	
	String name;
	
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		return this.id == book.id;
	}

	@Override
	public String toString() {
		return "{"+this.id+","+this.name+"}";
	}
}