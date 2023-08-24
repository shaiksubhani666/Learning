package Fibonacciseries;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Fibonacciseries(n);

	}

	public static void Fibonacciseries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		int nextNumber;
		for (int i = 0; i < n; i++) {
			System.out.print(firstTerm + ",");
			nextNumber = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextNumber;

		}

	}
}
