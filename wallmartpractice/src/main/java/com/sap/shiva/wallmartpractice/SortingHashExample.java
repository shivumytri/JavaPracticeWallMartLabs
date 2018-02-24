package com.sap.shiva.wallmartpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashExample {

	public static void main(String[] args) {

		Map<Integer, String> myHaspmap = new HashMap<Integer, String>();

		myHaspmap.put(5, "A");
		myHaspmap.put(11, "C");
		myHaspmap.put(4, "Z");
		myHaspmap.put(77, "Y");
		myHaspmap.put(9, "P");
		myHaspmap.put(66, "Q");
		myHaspmap.put(0, "R");

		System.out.println("Before sorting:");
		Set<Map.Entry<Integer, String>> set = myHaspmap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		Map<Integer,String> sortedMap = new TreeMap<Integer, String>(myHaspmap);
		System.out.println("After Sorrting");
		Set<Map.Entry<Integer,String>> set2= sortedMap.entrySet();
		Iterator<Map.Entry<Integer,String>> iterator2= set2.iterator();
		while(iterator2.hasNext()){
			Map.Entry<Integer,String> me1=(Map.Entry<Integer, String>) iterator2.next();
			System.out.print(me1.getKey() +": ");
			System.out.println(me1.getValue());
		}
	}

}
