package armstrongnumber;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Demo d = new Demo();
		int power = d.Digit(num);
		int res = d.Power1(num, power);
		if (num == res) {
			System.out.println("It is a ArmStrong Number");
		} else {
			System.out.println("It is not a ArmString Number");
		}
	}
}
