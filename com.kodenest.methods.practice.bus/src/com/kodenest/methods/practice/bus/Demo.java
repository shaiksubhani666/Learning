package com.kodenest.methods.practice.bus;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		DemoApp d=new DemoApp();
		d.marks(marks);
		
	}
}
