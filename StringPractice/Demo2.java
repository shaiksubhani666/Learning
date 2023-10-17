package StringPractice;

import java.util.Scanner;

public class Demo2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	for(int i=1;i<=3;i++) {
		String str=sc.next();
		int n=sc.nextInt();
		//format specifier
		//%n represents it will come to nextLine
		//-values will be for left reserved
	System.out.printf("%-15s%03d%n",str,n);
	}
	
}
}
