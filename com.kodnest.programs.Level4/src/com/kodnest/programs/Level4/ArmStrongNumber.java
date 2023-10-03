package com.kodnest.programs.Level4;

public class ArmStrongNumber {
  public  int armStrong(int num) {
	   int sum=0;
	   int power=Count(num);
	   while(num!=0) {
		   int digi=num%10;
		   int value=(int)Math.pow(digi,power);
		   sum=sum+value;
		   num=num/10;
	   }
	   return sum;
	   
   }
   int Count(int num) {
	   int count=0;
	   while(num!=0) {
		   int digi=num%10;
		   count++;
		   num=num/10;
	   }
	   return count;
   }
}
