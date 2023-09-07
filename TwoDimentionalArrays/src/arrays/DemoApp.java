package arrays;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bank[][] = new String[3][4];
		for (int i = 0; i <= bank.length - 1; i++) {

			for (int j = 0; j <= bank[i].length - 1; j++) {
				System.out.println("Enter the name of the Customer" + i);
				bank[i][j] = sc.next();

			}
		}
		System.out.println("Names of the customers of the banks are.....");
		for (int i = 0; i <= bank.length - 1; i++) {
			System.out.print("Bank" + i);
			for (int j = 0; j <= bank[i].length - 1; j++) {
				System.out.print(bank[i][j] + " ");

			}
			System.out.println();
		}
	}

}
