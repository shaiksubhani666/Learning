package pattern;

public class Demo15 {
	void patternP(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || i == 1 || j == n & i != 4 & i != 5 || i == 3)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
