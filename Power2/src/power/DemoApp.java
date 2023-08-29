//Write a java program to print the result of a number when it is raised to the power of 2
package power;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number!");
		int num = scanner.nextInt();
		Demo d = new Demo();
		int res = d.Power(num);
		System.out.println(res);

	}
}
