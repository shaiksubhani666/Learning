package pattern;

public class Demo3 {
	void patternD(int n) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i == 1&j<=4 )|| j == 1 || (i == 5&j<=4)||(i>=2&i<=4&j==5) )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		
		}

	}
}
