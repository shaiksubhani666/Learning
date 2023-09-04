package pattern;

public class Demo16 {
	void patternR(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || i == 1&j!=n || i == n && j >= n ||j==n&&i!=4&i!=5&i!=1&i!=3|| 
						 (i == 4 & j >= 3 & j != 4 & j != 5) || i == 3&&j!=n )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
