package com.sap.shiva.wallmartpractice;

import java.util.Arrays;

public class MinimumNumofPlatformsReq {

	public static void main(String[] args) {
		MinimumNumofPlatformsReq mm = new MinimumNumofPlatformsReq();
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println("Minimum number of platform required is: " + mm.findPlatform(arr, dep, arr.length));
	}

	private  int findPlatform(int[] arr, int[] dep, int length) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int plat_need = 1, result = 1;
		int i = 1, j = 0;
		
		while(i < length && j < length){
			if(arr[i] < dep[j]){
				plat_need += 1;
				i += 1;
				if(plat_need > result){
					result = plat_need;
				}
			}else {
				plat_need -= 1;
				j += 1;
			}
		}
		
		return result;
	}

}
