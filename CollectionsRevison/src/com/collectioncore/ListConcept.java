package com.collectioncore;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("mahesh");
		list.add("mangesh");
		list.add("sandeep");
		list.add("kiran");
		list.add("amit");
		System.out.println(list.size());
		//System.out.println(list);
		/*for (String c : list)
		{
			System.out.println(c);
		}
*/			//list.forEach(System.out::println);
list.forEach(a->System.out.println(a));
		}
	}


