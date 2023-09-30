package com.kodnest.Array.Level3;

public class MaxArray {

	int maxArray(int arr[]) {
		int max=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
