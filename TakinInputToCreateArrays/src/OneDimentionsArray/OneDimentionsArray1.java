package OneDimentionsArray;

import java.util.Scanner;


public class OneDimentionsArray1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the Array");
	int[] marks=new int[sc.nextInt()];
	for(int i=0;i<=marks.length-1;i++) {
		System.out.println("Enter the marks"+i);
	  marks[i]=sc.nextInt();
	}
	System.out.println("Array contents are....");
	for(int i=0;i<=marks.length-1;i++) {
		System.out.print(marks[i]+" ");
	}
	
}
}
