package com.kodnest.programs.Level4;

public class NumberReverse {
	 public int rev(int num) {
   int rev=0;
   while(num!=0) {
	   int digi=num%10;
	   rev=rev*10+digi;
	   num=num/10;
   }
   return rev;
	   
   }
}
