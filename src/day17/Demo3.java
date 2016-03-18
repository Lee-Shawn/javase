package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("aaa", 24));
		list.add(new Student("bsgd", 20));
		list.add(new Student("sd", 29));
		Collections.sort(list, new Compare());
		System.out.println(list);
	}
}

class Student {
	
	String name;
	
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "["+this.name+","+this.age+"]";
	}
}

class Compare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}
	
}
