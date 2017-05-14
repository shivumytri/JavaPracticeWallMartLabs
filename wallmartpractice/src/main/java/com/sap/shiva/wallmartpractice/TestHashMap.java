package com.sap.shiva.wallmartpractice;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> hash= new  HashMap<String,Integer>();
		
		hash.put("earth", 1);
		hash.put("man", 2);
		
		System.out.println(hash);
		hash.clear();
		System.out.println(hash);

	}

}
