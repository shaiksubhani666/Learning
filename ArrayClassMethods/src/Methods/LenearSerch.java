package Methods;

import java.util.Scanner;

public class LenearSerch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	
	LenearMethod l=new LenearMethod();
	int key=sc.nextInt();
	int index=l.lenear(arr,key);
	System.out.println("Key found at the index"+index);
}
}
