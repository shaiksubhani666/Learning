package com.kodnest.programs.Level5;

import java.util.Scanner;

import com.kodnest.programs.Level4.ArmStrongNumber;
import com.kodnest.programs.Level4.FactorialPrint;
import com.kodnest.programs.Level4.FactorsOfNumber;
import com.kodnest.programs.Level4.NumberReverse;
import com.kodnest.programs.Level4.Palendrome;
import com.kodnest.programs.Level4.fibinacci;
import com.kodnest.programs.Level4.primeNumber;

public class ProgramSearch {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
	int num=sc.nextInt();
	while(true) {
		System.out.println("Press----->1 to find ArmStrong number");
		System.out.println("Press----->2 to check  Palentrome number");
		System.out.println("Press----->3 to print Fibbinacci series");
		System.out.println("Press----->4 to Reverse the number");
		System.out.println("Press----->5 to print factors of number");
		System.out.println("Press----->6 to find Fctorial of number");
		System.out.println("Press----->7 to  print Prime number");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			int res=new ArmStrongNumber().armStrong(num);
			if(res==num) {
				System.out.println("Entered number is ArmStrong num");
			}
			else {
				System.out.println("It is not a ArmStrong number");
			}
			
		}
		break;
		case 2:
		{
			int res=new Palendrome().palendrome(num);
			if (res==num) {
				System.out.println("It is a palendrome number");
				return;
			}
			else {
				System.out.println("It is not a palendome number");
				return;
			}
			
		}
		
		
		case 3:
		{
			new fibinacci().fibbi(num);
			return;
		}
		case 4:
		{
			int rev=new NumberReverse().rev(num);
			System.out.println("Reversed number is"+rev);
			return;
		}
		case 5:
		{
			new FactorsOfNumber().factorsPrint(num);
			return;
		}
		case 6:
		{
			int fact=new FactorialPrint().factorial( num);
			System.out.println("Factorial of the Entered number is "+fact);
			return ;
		}
		case 7:
		{
		new primeNumber().printPrime(num);
			return;
		}
		default :
			System.out.println("Please check the User input");
			return;
			
		
		
		
			


	


	}
	
	}
	}
}
