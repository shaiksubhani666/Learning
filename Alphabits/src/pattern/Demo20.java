package pattern;

public class Demo20 {
	void patternW(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i == 3 & j != 2 & j != 4) ||( i == 4 & j != 3))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
