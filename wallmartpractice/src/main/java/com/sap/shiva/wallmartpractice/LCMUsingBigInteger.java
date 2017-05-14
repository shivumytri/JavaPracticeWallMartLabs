package com.sap.shiva.wallmartpractice;

import java.math.BigInteger;
import java.util.Scanner;

public class LCMUsingBigInteger 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0;i< N;i++){
        	int count = sc.nextInt();
        	int[] array = new int[count];
        	for ( int j=0; j <count; j++){
        		array[j] = sc.nextInt();
        	}
        	printLCM(array);
        }
    }

	private static void printLCM(int[] array) {
		BigInteger ans= BigInteger.ONE;
		
		for(int i=0; i< array.length ; i++){
			BigInteger b2 = new BigInteger(String.valueOf(array[i]));
			ans = (ans.multiply(b2)).divide(ans.gcd(b2));
		}
		
		System.out.println(ans.mod(new BigInteger("100000007")));
		
	}
}
