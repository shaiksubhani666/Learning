package StringPractice_Printing_subString;

import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0;i<=str.length()-1;i++) {
		for(int j=i+1;j<=str.length();j++) {
			System.out.println(str.substring(i,j));
		}
	}
	
			
}
}
