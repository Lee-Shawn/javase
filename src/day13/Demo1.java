package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("C++");
		c.add("Java");
		c.add("Python");
		c.add("Ruby");
		
		Object[] a = c.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
