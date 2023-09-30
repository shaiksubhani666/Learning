package com.kodnest.Array.Level3;


import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Array length");
    int arr[]=new int[sc.nextInt()];
    System.out.println("Enter "+arr.length+" Elemets");
     for(int i=0;i<=arr.length-1;i++) {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("Array before lenear Search");
     for(int i=0;i<=arr.length-1;i++) {
    	 System.out.print(arr[i]+" ");
     }
     System.out.println();
    System.out.println("Enter the Key to search");
    int key=sc.nextInt();
   int res= new LenearSearch().lenearSearch(arr, key);
   if(res>=0) {
	   
	   System.out.println("Key found at "+res);
	
   }
   else
   System.out.println("Key not found");

    }

}
