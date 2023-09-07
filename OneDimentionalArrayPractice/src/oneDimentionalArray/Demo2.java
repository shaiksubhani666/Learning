package oneDimentionalArray;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] subhani = new int[4];
		for (int i = 0; i <= subhani.length - 1; i++) {
			System.out.println("Enter the elsement" + i);
			subhani[i] = sc.nextInt();

		}
		System.out.println("Elements in the subhani is:");
		for (int i = 0; i <= subhani.length - 1; i++) {
			System.out.print(subhani[i] + " ");

		}

	}
}
