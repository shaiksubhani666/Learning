package palendromfinder;

public class Demo {
	void Palendrome(int num) {
		int original = num;
		int rev = 0;
		while (num > 0) {
			int ld = num % 10;
			rev = (rev * 10) + ld;
			num = num / 10;

		}
		if (rev == original) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
