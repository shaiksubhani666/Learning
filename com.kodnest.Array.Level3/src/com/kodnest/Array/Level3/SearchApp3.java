package com.kodnest.Array.Level3;

import java.util.Scanner;

public class SearchApp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Array length");
		   int []arr=new int[sc.nextInt()];
		   System.out.println("Enter  "+arr.length+"Elemets");
		   for(int i=0;i<=arr.length-1;i++) {
			   arr[i]=sc.nextInt();
		   }
		   
		  System.out.println("Array before Sorting");
		  for(int i=0;i<=arr.length-1;i++) {
			  System.out.print(arr[i]+" ");
		  }
		  System.out.println();
		  new SelectionSort().selectionSortAssending(arr);
		  System.out.println("Array after Sorting");
		  for(int i=0;i<=arr.length-1;i++) {
			  System.out.print(arr[i]+" ");
		  }
		  System.out.println();
		  new SelectionSort1().selectionSortDessending(arr);
		  System.out.println("Array afterDessending Sorting");
		  for(int i=0;i<=arr.length-1;i++) {
			  System.out.print(arr[i]+" ");
		  }
		  
		  
	}

}
