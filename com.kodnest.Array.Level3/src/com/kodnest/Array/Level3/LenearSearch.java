package com.kodnest.Array.Level3;

public class LenearSearch {
  int lenearSearch(int arr[],int key) {
	 for(int i=0;i<=arr.length-1;i++) {
		 if(key==arr[i]) {
			 
			 return i;
		 }
		 
		 
	 }
	 return -1;
  }
}
