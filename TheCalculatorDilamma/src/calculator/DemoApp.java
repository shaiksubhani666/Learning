/*Scenario: Alice is building a calculator program in Java. She wants to create a method
 *  that can perform basic arithmetic operations like addition, subtraction, multiplication, and division.
 *  She's not sure how to design the method to handle different operations.*/

package calculator;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Add(num1, num2);
		Sub(num1, num2);
		Mul(num1, num2);
		Div(num1, num2);

	}

	public static void Add(int a, int b) {
		System.out.println(a + b);
	}

	public static void Sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void Mul(int a, int b) {
		System.out.println(a * b);

	}

	public static void Div(int a, int b) {
		System.out.println(a / b);
	}

}
