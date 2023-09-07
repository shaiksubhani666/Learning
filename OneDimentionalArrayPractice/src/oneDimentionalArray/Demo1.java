package oneDimentionalArray;

import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int []arr=new int[3];
for(int i=0;i<=arr.length-1;i++) {
	System.out.println("Enter the element in the arr"+i);
    arr[i]=sc.nextInt();
    
    		}
     System.out.println("Elements  the array is:");
     for(int i=0;i<=arr.length-1;i++) {
    	 System.out.print(arr[i]+" ");
    	 
     }
		}
}
