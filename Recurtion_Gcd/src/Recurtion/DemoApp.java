package Recurtion;

import java.util.Scanner;

public class DemoApp {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	Demo d=new Demo();
	int res=d.Gcd(a,b);
	System.err.println(res);
}
}
