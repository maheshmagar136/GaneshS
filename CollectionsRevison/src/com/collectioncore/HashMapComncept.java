package com.collectioncore;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapComncept {
	public static void main(String[] args) {
		Map< String, String> hashmap = new HashMap<>();
		hashmap.put("2", "mahesh");
		hashmap.put("3", "mangesh");
		hashmap.put("5", "kiran");
		hashmap.put("", "mahesh a");
		hashmap.put("", "ankita");
	/*	for(Map.Entry<String,String> m : hashmap.entrySet())
    {
    	System.out.println(m.getKey()+":"+m.getValue());
	}*/
		hashmap.forEach((k,v)->System.out.println((k+":"+v)));
	}

}
