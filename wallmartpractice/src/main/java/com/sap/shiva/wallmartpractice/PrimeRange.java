package com.sap.shiva.wallmartpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime range");
		int minRange = sc.nextInt();
		int maxRange = sc.nextInt();
		sc.close();
		List<Integer> primes = new ArrayList<Integer>();
		int[] countOfDigits = new int[10];

		for (int i = 2; i < maxRange; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber && i >= minRange) {
				primes.add(i);
				int p = i;
				while (p != 0) {
					countOfDigits[p % 10] += 1;
					p = p / 10;
				}
			}
		}

		String s = primes.toString().replace("[", "").replace("]", "");

		System.out.println("The number of prime is " + primes.size() + " and they are " + s);

		for (int i = 0; i < countOfDigits.length; i++) {
			if(countOfDigits[i] != 0)
			System.out.println("digit:"+ i +" count is "+ countOfDigits[i]);
		}
	}

}
