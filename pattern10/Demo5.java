package pattern10;

public class Demo5 {
	void pattern() {
		for (int i = 1; i <= 5; i++)

		{

			for (int k = 1; k <= i; k++)

			{
				// space
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++)

			{
				// stars
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

			for (int j = 5; j >= i; j--)

			{

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
