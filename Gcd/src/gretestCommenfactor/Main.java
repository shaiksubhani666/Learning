//Question Description:
//Create a program that finds the Greatest Common Divisor (GCD) of two numbers.
//The program should accept two integers 'a' and 'b' as input.

package gretestCommenfactor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any to numbers  to find the gcd");
		int a = sc.nextInt();
		int b = sc.nextInt();
		FinfGcd(a, b);
	}

	public static void FinfGcd(int a, int b) {
		int gcd = 0;
		while (b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		gcd = a;
		System.out.println(gcd);
	}
}
