package pattern;

public class Demo19 {
	void patternV(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 & j <= 1 || j >= 5 & i != 4 & i != 5 && i != 3 && i != 4 && i != 2)
						|| (i == 2 & j != 3 & j != 1 & j != 5) || i == 3 && j != n && j != 4 && j != 2 && j != 1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
