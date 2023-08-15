package com.kodnest.method3.practice;
import java.util.Scanner;
public class Journycalulator {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Speed and Time of the vehicle:");
	double Speed=sc.nextInt();
	double time=sc.nextInt();
	distence d=new distence();
	System.out.println(d.distenceCalculation( Speed, time));
}
   
}
