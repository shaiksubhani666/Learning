package Recursion;

import java.util.Scanner;

public class DemoApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Demo d=new Demo();
    int res=d.fact(n);
    System.out.println(res);
	
}
}
