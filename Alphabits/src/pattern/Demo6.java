package pattern;

public class Demo6 {
	void patternG() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1 || (i == 3 & j >= 3) || i == 5 || (j == 5 & i >= 3))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}
