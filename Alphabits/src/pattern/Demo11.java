package pattern;

public class Demo11 {
	void patternL(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || i == n)
					System.out.print("*");

			}
			System.out.println();
		}

	}
}
