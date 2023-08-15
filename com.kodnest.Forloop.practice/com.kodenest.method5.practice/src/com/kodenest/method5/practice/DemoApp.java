package com.kodenest.method5.practice;
import java.util.Scanner;
public class DemoApp {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int marks=sc.nextInt();
	System.out.println("Welcom to Kodenest");
	Demo d=new Demo();
	d.Tech(marks);
	
}
}
