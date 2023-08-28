//Create a program that checks whether a number is a palindrome or not. The program should accept an integer 'n' as input.
package palendromfinder;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();
		Demo d = new Demo();
		d.Palendrome(num);
	}
}
