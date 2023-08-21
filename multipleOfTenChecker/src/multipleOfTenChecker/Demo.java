package multipleOfTenChecker;
import java.util.Scanner;
public class Demo {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	checkMultipleOfTen(n);
}
   private static void checkMultipleOfTen(int n) {
	// TODO Auto-generated method stub
	   if(n%10==0) {
		   System.out.println("The number is multiple of 10 ");
	   }
	
}

}
