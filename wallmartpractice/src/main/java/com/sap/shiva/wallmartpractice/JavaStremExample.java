package com.sap.shiva.wallmartpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaStremExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(9);
		list.add(56);
		list.add(45);
		
		int sum = sumIterator(list);
		System.out.println("normal " + sum );
		sum = sumIteratorSteam(list);
		System.out.println("steam " + sum );
		
	}
	public static int sumIterator(List<Integer> list){
		Iterator<Integer> it= list.iterator(); 
		int sum = 0;
		while(it.hasNext()){
			int num = it.next();
			if(num > 10){
				sum += num;
			}
		}		
		return sum;
	}
	
	public static int sumIteratorSteam(List<Integer> list){
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
}
