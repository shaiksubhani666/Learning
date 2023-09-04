package pattern;

public class Demo7 {
	void patternH(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 1 || j == n || (i == 1 & j <= 1 || j >= n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
