package com.itp.training;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		Map nameMap = new HashMap();

		nameMap.put(10, "SUNIL");
		nameMap.put(11, "ANIL");
		nameMap.put(12, "SHIVANSH");
		nameMap.put(13, "GANESH");
		nameMap.put(14, "MAULI");
		nameMap.put(15,null);
		nameMap.put(16,null);
		nameMap.put(null,"AKASH");
		nameMap.put(null,"AKSHAY");
		nameMap.put(14, "MANDAL");
		
		System.out.println(nameMap);
		
		Object obj = nameMap.get(12);
		System.out.println(obj);
		
		System.out.println("20->"+nameMap.get(20));
		
		System.out.println("20->"+nameMap.getOrDefault(20, "SATISH"));

		
		
	}
}
