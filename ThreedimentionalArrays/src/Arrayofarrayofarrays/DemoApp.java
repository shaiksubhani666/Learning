package Arrayofarrayofarrays;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[3][2][5];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("ENter the age of student "+k+" class "+j+" School "+i);
					arr[i][j][k]=sc.nextInt();
					
					
				}
			}
		}
		System.out.println("Arrey contents are...");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
