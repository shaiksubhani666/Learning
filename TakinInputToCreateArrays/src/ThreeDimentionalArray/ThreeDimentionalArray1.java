package ThreeDimentionalArray;

import java.util.Scanner;

public class ThreeDimentionalArray1 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the 3d Length");
  int arr[][][]=new int[sc.nextInt()][][];
  System.out.println("Enter the 3d of 2d lenths");
  for(int i=0;i<=arr.length-1;i++) {
	  arr[i]=new int[sc.nextInt()][];
	  
  }
  	for(int i=0;i<=arr.length-1;i++) {
  		for(int j=0;j<=arr[i].length-1;j++) {
  			arr[i][j]=new int[sc.nextInt()];
  			
  		}
  	}
  
  	for(int i=0;i<=arr.length-1;i++) {
  		for(int j=0;j<=arr[i].length-1;j++) {
  			for(int k=0;k<=arr[i][j].length-1;k++) {
  		   System.out.println("Enter the Elements");
  		   arr[i][j][k]=sc.nextInt();
  		  
  			}
  			
  		}
  	}
  	System.out.println("Array contents are......");
  	for(int i =0;i<=arr.length-1;i++) {
  		for(int j=0;j<=arr[i].length-1;j++) {
  			for(int k=0;k<=arr[i][k].length-1;k++) {
  				System.out.print(arr[i][j][k]+"  ");
  				
  			}
  			System.out.println();
  		}
  		System.out.println();
  		
  	}
  
	}

}
