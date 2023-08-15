package com.kodnest.method1.practice;
import java.util.Scanner;
public class DoubleNumber {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to double:");
		int num=sc.nextInt();
		System.out.println(doubleTheNumber(num));
		
	}
      public static int doubleTheNumber(int num) {
    	  return 2*num;
      }
}

