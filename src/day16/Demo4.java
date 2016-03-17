package day16;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Compare c = new Compare();
		TreeSet t = new TreeSet(c);
		
		Book b1 = new Book(1, "thinking in java");
		Book b2 = new Book(2, "thinking in c++");
		Book b3 = new Book(4, "core java");
		Book b4 = new Book(2, "c++ primer");
		
		t.add(b1);
		t.add(b2);
		t.add(b3);
		t.add(b4);
		
		System.out.println(t);
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
	public String toString() {
		return "{" + this.id + "," + this.name + "}";
	}
}

class Compare implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.id - o2.id;
	}
	
}