package day17;

import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args) {
		TreeMap<Book, String> tree = new TreeMap<Book, String>();
		tree.put(new Book("Thinking in Java", "2001-12-3"), "Java");
		tree.put(new Book("Thinking in C++", "1998-4-24"), "C++");
		tree.put(new Book("Date Structure", "2004-4-21"), "C");
		
		System.out.println(tree);
	}
}

class Book implements Comparable<Book> {
	
	String name;
	
	String date;
	
	public Book(String name, String string) {
		this.name = name;
		this.date = string;
	}

	@Override
	public int compareTo(Book o) {
		return this.date.compareTo(o.date);
	}

	@Override
	public String toString() {
		return "[" + this.name+","+this.date+"]";
	}
}