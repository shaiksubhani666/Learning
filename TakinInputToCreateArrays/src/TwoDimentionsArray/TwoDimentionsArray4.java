package TwoDimentionsArray;

import java.util.Scanner;

public class TwoDimentionsArray4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2d Diments");
		int arr[][]=new int[sc.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the One D length");
			arr[i]=new int[sc.nextInt()];
			
		
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the Element...");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array contents are......");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			   System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}

}
