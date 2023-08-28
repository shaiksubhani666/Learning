//Create a program that calculates the sum of the digits of a number. The program should accept an integer 'n' as input.
package sumofdigits;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number!");
		int num = sc.nextInt();
		Demo d = new Demo();
		d.SumofDigit(num);
	}
}
