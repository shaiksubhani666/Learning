package armstrongnumber;

public class Demo {
	int Digit(int num) {
		int count = 0;
		while (num != 0) {
			int digit = num % 10;
			count++;
			num = num / 10;
		}
		return count;
	}

	int Power1(int num, int power) {
		int sum = 0;
		if (num == 0) {
			return 0;
		}
		while (num != 0) {
			int ld = num % 10;
			int value = (int) Math.pow(ld, power);
			sum = sum + value;
			num = num / 10;

		}
		return sum;
	}
}
