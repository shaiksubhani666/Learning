package TwoDimentionsArray;

import java.util.Scanner;

public class TwoDimentionsArray1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1d and 2d length");
	int [][]marks=new int[sc.nextInt()][sc.nextInt()];
	for(int i=0;i<=marks.length-1;i++) {
		for(int j=0;j<=marks[i].length-1;j++) {
			System.out.println("Enter an element");
			marks[i][j]=sc.nextInt();
		}
	}
	System.out.println("Array contents are........");
	for(int i=0;i<=marks.length-1;i++ ) {
		for(int j=0;j<=marks[i].length-1;j++) {
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
}
}
