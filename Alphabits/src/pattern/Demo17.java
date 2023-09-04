package pattern;

public class Demo17 {
	void patternS(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == 3 || i == n || j == 1 & i != 4 & i != n || j == n & i != 2)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
