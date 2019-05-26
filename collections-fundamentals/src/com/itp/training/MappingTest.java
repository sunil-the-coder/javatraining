package com.itp.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MappingTest {

	public static void main(String[] args) {

		List<String> keywords = Arrays.asList(
				"banana", "aeroplane", "apple", "bungy", 
				"bat", "anil", "satish", "sunil",
				"sameer","laptop","bulb","machine");

		Map<Character, SortedSet<String>> mappings = new TreeMap();

		keywords.stream().forEach(keyword-> {
			char key = keyword.charAt(0);
			SortedSet<String> matchingWords = mappings.get(key);
			if(matchingWords == null)
				matchingWords = new TreeSet<String>();
			
			matchingWords.add(keyword);
			mappings.put(key,matchingWords);
		});

		mappings.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}
}
