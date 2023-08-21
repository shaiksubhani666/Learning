//Create a program that categorizes people based on their age: Child (0-12), Teen (13-19),
//Adult (20-59), Senior (60+). The program should accept an integer 'age' as input.


package agecatagiry;
import java.util.Scanner;
public class Demo {
	public static void categorizeAge(int age) {
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Child");
			
		}
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}
		else {
		System.out.println("Senior");
		}
		}
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int age=sc.nextInt();
		    categorizeAge(age);
		    
	}
}
