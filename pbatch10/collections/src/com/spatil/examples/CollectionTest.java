package com.spatil.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {

		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(10, "Sunil");
		map.put(14, "Akshay");
		map.put(12, "Sandip");
		map.put(11, "Ganesh");
		map.put(13, "Anil");
		
		System.out.println(map);
	}
}
