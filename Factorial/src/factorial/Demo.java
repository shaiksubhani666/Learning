
package factorial;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial");
		int num = sc.nextInt();
		TofindFactorial(num);

	}

	public static void TofindFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}
}
