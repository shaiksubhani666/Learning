package com.kodnest.Array.Level3;

public class MinArray {
 int minArray(int arr[]) {
	 int min=arr[0];
	 for(int i=1;i<=arr.length-1;i++) {
		 if(arr[i]<min) {
			 min=arr[i];
		 }
	 }
	 return min;
 }
 
}
