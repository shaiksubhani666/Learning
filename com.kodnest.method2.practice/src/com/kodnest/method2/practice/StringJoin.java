package com.kodnest.method2.practice;
import java.util.Scanner;
public class StringJoin {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(joinStrings(str1,str2));
		
	}
   public static  String joinStrings(String str1, String str2) {
	   return str1+str2;
   }
}
