package com.kodnest.method;
import java.util.Scanner;
public class DemoApp {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a two numbers to add:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println(subtractNumbers(num1,num2));
	System.out.println(multiplyNumbers(num1,num2));
	System.out.println(divideNumbers(num1,num2));
	System.out.println(modulosNumbers(num1,num2));
	
}
   public static int subtractNumbers(int num1, int num2) {
	   return num1-num2;
	   
   }
   public static int multiplyNumbers(int num1, int num2) {
	   return num1*num2;
   }
   public static double divideNumbers(int num1, int num2) {
	   return num1/num2;
   }
   public static int modulosNumbers(int num1, int num2) {
	   return num1%num2;
   }
   
   
}
