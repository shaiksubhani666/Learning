package com.kodnest.method.switch1.practice;
import java.util.Scanner;
public class Demo {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number to know the name of the day:");
	  int day=sc.nextInt();
	  DemoApp d=new DemoApp();
	  d.Day(day);
}
}
