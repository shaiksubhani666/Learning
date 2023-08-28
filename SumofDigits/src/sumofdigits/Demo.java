package sumofdigits;

public class Demo {
	void SumofDigit(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;

		}
		System.out.println(sum);
	}

}
