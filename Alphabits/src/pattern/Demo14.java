package pattern;

public class Demo14 {
	void patternO(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((j == 1 & i != n & i != 1) || (i == 1 & j != 1 & j != n & j != 3) || (j == 5 & i != n & i != 1)
						|| (i == 5 & j != n & j != 1 & j != 3))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
