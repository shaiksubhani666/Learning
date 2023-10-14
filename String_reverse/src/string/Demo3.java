package string;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr1[]=str.split(" ");
	StringBuffer sp=new StringBuffer();
	for(int i=arr1.length-1;i>=0;i--) {
		sp=sp.append(arr1[i]+" ");
	}
	System.out.println(sp);
}
}
