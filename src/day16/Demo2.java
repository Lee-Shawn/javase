package day16;

import java.util.HashSet;

public class Demo2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet h = new HashSet();
		Language l1 = new Language(111, "java");
		Language l2 = new Language(222, "c++");
		Language l3 = new Language(333, "python");
		Language l4 = new Language(111, "ruby");
		h.add(l1);
		h.add(l2);
		h.add(l3);
		h.add(l4);
		
		System.out.println(h);
	}
}

class Language {
	
	int id;
	
	String name;
	
	public Language(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println(this.name+"调用了hashCode()");
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Language l = (Language)obj;
		System.out.println(this.name+"调用了equals()");
		return this.id == l.id;
	}

	@Override
	public String toString() {
		return "{"+this.id+","+this.name+"}";
	}
	
}