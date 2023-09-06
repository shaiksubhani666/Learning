package array;

import java.util.Scanner;

public class DemoApp1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String []Employee=new String[7];
	for(int i=0;i<=Employee.length-1;i++) {
		System.out.println("ENter the name of the Employee"+i);
		Employee[i]=sc.next();
	}
	System.out.println("Names of the employees are!");
	for(int i=0;i<=Employee.length-1;i++) {
		System.out.print(Employee[i]+" ");
	}
	
}
}
