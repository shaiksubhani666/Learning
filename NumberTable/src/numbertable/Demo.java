//Question Description: Create a program that prints the multiplication table of a given number
// The program should accept an integer 'num' as input.

package numbertable;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print the table:");
		int num = sc.nextInt();
		printTable(num);

	}

	public static void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}
}
