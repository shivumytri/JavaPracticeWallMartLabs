package com.sap.shiva.wallmartpractice;

public class WordBreak {

	public static void main(String[] args) {
		WordBreak wb = new WordBreak();

		String result = wordBreakTest("ilikesamsung") ? "yes" : "no";
		System.out.println(result);
		result = wordBreakTest("iiiiiiii") ? "yes" : "no";
		System.out.println(result);
		result = wordBreakTest("") ? "yes" : "no";
		System.out.println(result);
		result = wordBreakTest("ilikelikeimangoiii") ? "yes" : "no";
		System.out.println(result);
		result = wordBreakTest("samsungandmango") ? "yes" : "no";
		System.out.println(result);
		result = wordBreakTest("samsungandmangok") ? "yes" : "no";
		System.out.println(result);
	}

	public static boolean wordBreakTest(String str) {
		int size = str.length();

		if (size == 0)
			return false;

		for (int i = 1; i < size; i++) {
			// boolean dictResult = dictionaryContains(str.substring(0, i)); 
		    // boolean recurCallResult= wordBreakTest(str.substring(i, size - i));
			//if ( dictResult && recurCallResult)
			if ( dictionaryContains(str.substring(0, i)) && wordBreakTest(str.substring(i, size - i)))
				return true;
		}

		return false;
	}

	public static boolean dictionaryContains(String word) {
		String dictionary[] = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i",
				"like", "ice", "cream" };

		for (int i = 0; i < dictionary.length; i++) {
			boolean result = dictionary[i].equals(word);
			if (result)
				return true;
		}
		return false;
	}

}
