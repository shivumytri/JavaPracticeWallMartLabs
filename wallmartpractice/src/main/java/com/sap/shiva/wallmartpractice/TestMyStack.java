package com.sap.shiva.wallmartpractice;

import java.util.Scanner;

public class TestMyStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		char[] charArray = input.toCharArray();

		String[] strArray = new String[charArray.length];

		for(int i=0;i< charArray.length ;i++){
			strArray[i] = ""+charArray[i];
		}

		if (areParenthesisBalanced(strArray)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

	private static boolean areParenthesisBalanced(String[] charArray) {

		MyStack<String> stack = new MyStack<String>();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i].equals("{") || charArray[i].equals("(") || charArray[i].equals("[")) {
				stack.push("" + charArray[i]);
			}

			if (charArray[i].equals("}") || charArray[i].equals(")") || charArray[i].equals("]")) {
				if (stack.isEmpty())
					return false;
				else if (!isMatchParenthise(stack.pop(), charArray[i])) {
					return false;
				}
			}
		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static boolean isMatchParenthise(String strOne, String strTwo) {
		if (strOne.equals("(") && strTwo.equals(")")) {
			return true;
		} else if (strOne.equals("[") && strTwo.equals("]")) {
			return true;
		} else if (strOne.equals("{") && strTwo.equals("}")) {
			return true;
		} else {
			return false;
		}
	}

}
