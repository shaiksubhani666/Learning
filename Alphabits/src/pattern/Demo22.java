package pattern;

public class Demo22 {
	void patternY(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j & j <= 3 || i + j == 6 & i <= 3 || j == 3 & i >= 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
