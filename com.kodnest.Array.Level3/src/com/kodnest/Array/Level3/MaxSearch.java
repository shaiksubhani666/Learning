package com.kodnest.Array.Level3;

import java.util.Scanner;

public class MaxSearch {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Array length");
  int arr[]=new int[sc.nextInt()];
  for(int i=0;i<=arr.length-1;i++) {
	  arr[i]=sc.nextInt();
	  
  }
  int max=new MaxArray().maxArray(arr);
   System.out.println("The Maxirmum element in the array is"+max);
	}

}
