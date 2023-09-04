package pattern;

public class Demo10 {

	void patternK(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || i == 1 && j >= n || i == n && j >= n || (i == 2 & j >= 3 & j != 4 & j != 5)
						|| (i == 4 & j >= 3 & j != 4 & j != 5) || i == 3 & j <= 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
