package pattern;

public class Demo5 {
	void patternF(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == 3)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}
}
