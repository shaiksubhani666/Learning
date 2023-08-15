package com.kodnest.method4.practice;
import java.util.Scanner;
public class TemparatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the fahrenheit");
	double fahrenheit=sc.nextDouble();
	TemparatureConverter tem=new TemparatureConverter();
	double res=tem.fahrenheitToCelcious(fahrenheit);
	System.out.println("You have successfully converted the fahrenheit to celcious"+res);
	
	
	
	}
}