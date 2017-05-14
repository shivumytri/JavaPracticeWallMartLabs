package com.sap.shiva.wallmartpractice;

import java.util.Scanner;

public class TestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dicSize = sc.nextInt();
		int lengthofWord = sc.nextInt();

		String[] dictionary = new String[dicSize];

		for (int i = 0; i < dicSize; i++) {
			dictionary[i] = sc.next();
		}
		
		//sc.nextLine();
		
		int querySize = sc.nextInt();

		String[] queries = new String[querySize];

		for (int i = 0; i < querySize; i++) {
			queries[i] = sc.next();
		}
		
		sc.close();
		
		TestWord tw = new TestWord();

		tw.checkWord(dictionary, queries);

	}

	private void checkWord(String[] dictionary, String[] queries) {
		int count = 0;
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < dictionary.length; j++) {
				int temp = getCount(dictionary[j], queries[i]); 
				count = count + temp;
			}
			System.out.println(count);
			count=0;
		}		
	}

	private int getCount(String dicword, String queryword) {
		int count =0;
		char[] arrDicWord  = dicword.toCharArray();
		char[] arrQueryWord = queryword.toCharArray();
		
		int track = 0;
		for(int i=0; i < arrQueryWord.length; i++){
			if(arrQueryWord[i] == '?'){
				track += 1;
			}else if (arrQueryWord[i] != '?' && arrQueryWord[i]  == arrDicWord[i]){
				track += 1;
			}else 
				break;
		}
		
		if(track == arrQueryWord.length){
			count = 1;
		}else {
			count = 0;
		}
		return count;
	}

}
