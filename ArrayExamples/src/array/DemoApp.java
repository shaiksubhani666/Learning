package array;

import java.util.Scanner;

public class DemoApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []Student=new int [4];
	for(int i=0;i<=Student.length-1;i++) {
		System.out.println("Enter the marks of the student"+i);
		Student[i]=sc.nextInt();
		
		
	}
	System.out.println("Marks of the students are:");
	for(int i=0;i<=Student.length-1;i++) {
		System.out.print(Student[i]+" ");
	}
	
	
}
}
