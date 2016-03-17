package day16;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo5 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		String s = "12 4 5 2 6";
		String[] a = s.split(" ");
		
		TreeSet t = new TreeSet<String>();
		for (int i = 0; i < a.length; i++) {
			t.add(Integer.parseInt(a[i]));
		}

		Iterator it = t.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
