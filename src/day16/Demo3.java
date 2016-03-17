package day16;

import java.util.TreeSet;

public class Demo3 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(new Person(2, "bbb"));
		tree.add(new Person(1, "aaa"));
		tree.add(new Person(3, "ccc"));
		System.out.println(tree);
	}
}

@SuppressWarnings("rawtypes")
class Person implements Comparable {
	
	int id;
	
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{"+this.id+","+this.name+"}";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.id - p.id;
	}
	
}