package com.sap.shiva.wallmartpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String binaryStr = Integer.toBinaryString(input);
		int count = 0;	
		List<Integer>  mylist= new ArrayList<Integer>();		
		for (int i = 0; i < binaryStr.length(); i++) {
			if (binaryStr.charAt(i) == '1') {
				count++;
			} else {
				mylist.add(count);
				count=0;
			}
		}
		mylist.add(count);
		int largest = 0;
		for(Integer o1: mylist){			
			if( o1.intValue() > largest ){
				largest = o1.intValue();
			}				
		}
		System.out.println(largest);
		
	}

}
