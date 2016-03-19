package day18;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
	public static void main(String[] args) {
		HashMap<Integer , String> map = new HashMap<Integer, String>();
		map.put(001, "aaa");
		map.put(002, "bbb");
		map.put(004, "ccc");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
}
