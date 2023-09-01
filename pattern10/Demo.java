package pattern10;

public class Demo {
	void pattern() {
		for (int i = 1; i <= 5; i++) {
			// lines
			for (int j = 1; j <= 5; j++) {
				// space
				System.out.print(" ");

			}
			for (int k = 1; k <= 5; k++) {

				// number of stars
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
