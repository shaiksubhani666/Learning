package pattern10;

public class Demo9 {
	void pattern() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) 
					System.out.print("*");
				
				if(j==2 && i==2 || j==3&& i==3||j==4&&i==4) 
					System.out.print("*");
				else
					System.out.println(" f");
				
				
				
			}
			System.out.println();
		}
		
	}
}
