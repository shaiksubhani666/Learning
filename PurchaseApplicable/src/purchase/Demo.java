/*Question Description: Create a program that checks if the purchase is above $100 and prints
 *  "Discount Applicable". 
 * The program should accept a double 'purchaseAmount' as input.
 */
package purchase;
import java.util.Scanner;
public class Demo {
  public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   double purchase=sc.nextDouble();
	   checkDiscount(purchase);
	   
}
  public static void checkDiscount(double purchase) {
	  if(purchase>100) {
		  System.out.println("Discount is Applicable:");
	  }
  }
}
