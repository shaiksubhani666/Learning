//Write a java program to print the result of a number when it is raised to the power of number of digits in the number
package powerofDigitsOfNumber;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Demo d = new Demo();
		int res = d.Counts(num);
		int finalvalue = d.PowerP(num, res);
		System.out.println();

	}
}
