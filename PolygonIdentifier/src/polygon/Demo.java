//Create a program that identifies the type of a polygon based on the number of its sides. The program should accept an integer 'sides' as input.

//Note:1) Use Switch conditional control construct

//Note:2)include tryangle, Quadrilateral,Pentagon and hexagon
package polygon;

import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of  sides to know the polygone:");
	int sides=sc.nextInt();
	identifyPolygon(sides);
	
	
}
   public static void identifyPolygon(int sides) {
	   switch(sides) {
	   case 3:
		   System.out.println("It is Tryangle");
		   break;
	   case 4:
		   System.out.println("It is Quadrilateral");
		   break;
	   case 5:
		   System.out.println("It is Pentagon");
		   break;
	   case 6:
		   System.out.println("It is Hexagon");
		   break;
		   default :
			   System.out.println("Please read the massage");
	   }
   }
}
