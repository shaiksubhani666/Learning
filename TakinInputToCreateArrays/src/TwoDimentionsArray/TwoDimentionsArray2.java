package TwoDimentionsArray;

import java.util.Scanner;

public class TwoDimentionsArray2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2d Dimentions length");
int arr[][]=new int[sc.nextInt()][];
for(int i=0;i<=arr.length-1;i++) {
	
		System.out.println("Enter the 2D in 1d size");
		arr[i]=new int[sc.nextInt()];
		
	
}
for(int i=0;i<=arr.length-1;i++) {
	for(int j=0;j<=arr[i].length-1;j++) {
		System.out.println("Enter the elements:"+i);
		arr[i][j]=sc.nextInt();
	}
}
System.out.println("Arrray contents are");
for(int i=0;i<=arr.length-1;i++) {
	for(int j=0;j<=arr[i].length-1;j++) {
		System.out.println(arr[i][j]+" ");
		
		
	}
	System.out.println();
}
	}

}
