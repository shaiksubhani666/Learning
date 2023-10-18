package Arraysum_diagonal;

import java.util.Scanner;

public class DemoApp {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr1[][]=new int[n][n];
    for(int i=0;i<=arr1.length-1;i++) {
    	for(int j=0;j<=arr1.length-1;j++) {
    	arr1[i][j]=sc.nextInt();
    	
    	}
    }
    for( int i=0;i<=arr1.length-1;i++) {
    	for(int j=0;j<=arr1[i].length-1;j++) {
    		System.out.print(arr1[i][j]+" ");
    	}
    }
    System.out.println();
    int res1=Demo.SumOfDiagonals(arr1);
    System.out.println(res1);
    
    
 }
}
