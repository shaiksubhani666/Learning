package pattern;

public class Demo9 {
	void patternJ(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 4 || (i == 1) || (i == n && j <= 3) || i == 4 && j <= 4 & j <= 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
