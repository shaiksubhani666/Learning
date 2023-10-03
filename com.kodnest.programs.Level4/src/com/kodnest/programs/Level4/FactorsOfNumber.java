package com.kodnest.programs.Level4;

public class FactorsOfNumber {
	public void factorsPrint(int num) {
		  System.out.println("Factors of the number"+num);
		  for(int i=1;i<=num;i++) {
			  if(num%i==0) {
				  System.out.print(i+" ");
			  }
		  }
		  
	  }
}
