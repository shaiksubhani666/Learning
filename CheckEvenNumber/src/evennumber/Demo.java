//Create a program that prints all the even numbers between 1 and 'n'.
//The program should accept an integer 'n' as input.


package evennumber;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the range of even numbers");
		int num = sc.nextInt();
		CheckEven(num);

	}

	public static void CheckEven(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
