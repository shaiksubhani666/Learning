package pattern10;

public class Demo4 {
	void pattern() {
		for (int i = 1; i <= 5; i++)

		{

			for (int k = 1; k <= i; k++)

			{

				System.out.print(" ");

			}

			for (int j = 1; j <= 5; j++)

			{

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 1; i <= 5; i++)

		{

			for (int k = 5; k >= i; k--)

			{

				System.out.print(" ");

			}

			for (int j = 1; j <= 5; j++)

			{

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
