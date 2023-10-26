package Methods;

import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	int key=sc.nextInt();
	BinarySearchMethod b=new BinarySearchMethod();
	int keyIndex=b.binarySearch(arr,key);
	System.out.println("Key found at the Index"+keyIndex);
}
}
