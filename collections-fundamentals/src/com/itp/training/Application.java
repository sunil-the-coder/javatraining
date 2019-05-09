package com.itp.training;

import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {

		Map nameMap = new TreeMap();

		nameMap.put(10, "SUNIL");
		nameMap.put(20, "ANIL");
		nameMap.put(19, "SHIVANSH");
		nameMap.put(23, "GANESH");
		nameMap.put(14, "MAULI");
		nameMap.put(15,null);
		nameMap.put(16,null);
		//nameMap.put(null,"AKASH");
		//nameMap.put(null,"AKSHAY");
		nameMap.put(14, "MANDAL");
		
		
		nameMap.forEach((k, v) -> System.out.println(k + "|"+v));
		
//		System.out.println(nameMap);
		
		Object obj = nameMap.get(12);
		System.out.println(obj);
		
		System.out.println("20->"+nameMap.get(20));
		
		System.out.println("20->"+nameMap.getOrDefault(20, "SATISH"));

		
		
	}
}
