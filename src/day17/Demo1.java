package day17;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "Java");
		map.put("002", "C++");
		map.put("003", "Python");
		
		System.out.println(map);
		
		boolean key = map.containsKey("002");
		System.out.println(key);
		
		boolean value = map.containsValue("Ruby");
		System.out.println(value);
		
		System.out.println(map.get("001"));
		
		System.out.println(map.hashCode());
		
		System.out.println(map.isEmpty());
		
		map.remove("004");
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		System.out.println(map.entrySet());
	}
}
