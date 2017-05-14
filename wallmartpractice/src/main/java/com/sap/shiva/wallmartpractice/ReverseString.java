package com.sap.shiva.wallmartpractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String str = sc.nextLine();

		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1 ; i >= 0 ; i--){
			System.out.print(charArray[i]);
		}
		
		
		
		
	}

}
