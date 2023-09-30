package com.kodnest.Array.Level3;

import java.util.Scanner;

public class SearchApp1 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Array length");
   int []arr=new int[sc.nextInt()];
   System.out.println("Enter  "+arr.length+"Elemets");
   for(int i=0;i<=arr.length-1;i++) {
	   arr[i]=sc.nextInt();
   }
     System.out.println("Enter the key");
     int key=sc.nextInt();
   int res= new BinarySearch().binarySearch(arr, key);
    if(res>=0) {
    	System.out.println("Key found at index"+res);
    }
    else {
    	System.out.println("Key not found");
    }
	}

}
