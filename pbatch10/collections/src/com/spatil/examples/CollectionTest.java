package com.spatil.examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {

}

public class CollectionTest {

	public static void main(String[] args) {

		Map map = new HashMap(); // key-value pair
		map.put(10, "Sunil");
		map.put(20, "Anil");
		map.put(30, 100);
		map.put(40, "Arvind");

		System.out.println(map);

		Object value  = map.get(40);
		System.out.println(value);
		
		//return only keys
		Set keys = map.keySet();
		System.out.println(keys);
		
		//return only values
		Collection coll = map.values();
		System.out.println(coll);
		
		//key value pairs
		Set<Entry> entrySet = map.entrySet();
		
		
		for(Entry entry : entrySet)
			System.out.println(entry.getKey()+" = "+entry.getValue());
		
		
	}
}
