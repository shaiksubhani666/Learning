package powerofDigitsOfNumber;

public class Demo {
	int PowerP(int num, int res) {
		int original = 1;
		for (int i = 1; i <= res; i++) {
			original = original * num;

		}
		return original;

	}

	int Counts(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
