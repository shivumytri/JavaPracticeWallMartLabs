package com.sap.shiva.wallmartpractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapSortByValueExample {

	public static void main(String[] args) {
		Map<Integer, String> myHashMap = new HashMap<Integer, String>();
		myHashMap.put(5, "A");
		myHashMap.put(11, "C");
		myHashMap.put(4, "Z");
		myHashMap.put(77, "Y");
		myHashMap.put(9, "P");
		myHashMap.put(66, "Q");
		myHashMap.put(0, "R");
		
		System.out.println("Before Sorting:");
		Set<Map.Entry<Integer, String>> set=myHashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());			
		}
		
		System.out.println("After Sorting : ");
		Map<Integer, String> sortedMap = getSortedMap(myHashMap);
		Set<Map.Entry<Integer, String>> set2 = sortedMap.entrySet();
		Iterator<Map.Entry<Integer, String>>  iterator2 = set2.iterator();
		while(iterator2.hasNext()){
			Map.Entry<Integer, String> me2 = (Map.Entry<Integer, String>) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}			
	}
	private static Map<Integer, String> getSortedMap(Map<Integer, String> myHashMap) {
		
		List<Map.Entry<Integer, String>>  myList = new  LinkedList<Map.Entry<Integer,String>>(myHashMap.entrySet());		
		//List  myList = new  LinkedList(myHashMap.entrySet());		
		
		Collections.sort(myList, new Comparator<Map.Entry<Integer,String>>(){
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2 ){
				return (((Map.Entry<Integer, String>) (o1)).getValue()).compareTo(((Map.Entry<Integer, String>) (o2)).getValue());						
			}
			
		});			
		HashMap<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();		
		for(Iterator<Map.Entry<Integer, String>> it = myList.iterator(); it.hasNext();){
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) it.next();
			sortedMap.put(me.getKey(), me.getValue());			
		}	
		return sortedMap;
	}

}
