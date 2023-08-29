//Write a java program to print the result of a number when it is raised to the power of n
package powern;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number!");
		int num = sc.nextInt();
		System.out.println("Enter power of the number!");
		int n = sc.nextInt();
		DemoApp d = new DemoApp();
		int res = d.Power(num, n);
		System.out.println(res);

	}

}
