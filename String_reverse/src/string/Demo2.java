package string;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	String revsentence="";
	for(int i=0;i<=arr.length-1;i++ ) {
		String word=arr[i];
		String revword="";
		for(int j=word.length()-1;j>=0;j--) {
			revword=revword+word.charAt(j);
		}
		revsentence=revsentence+revword+" ";
				
	}
	
	System.out.println(revsentence);
}
}
