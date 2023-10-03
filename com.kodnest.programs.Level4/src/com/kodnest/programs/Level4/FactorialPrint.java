package com.kodnest.programs.Level4;

public class FactorialPrint {
      public int factorial(int num) {
    	 int factorial=1;
    	 for(int i=1;i<=num;i++) {
    		 factorial=factorial*i;
    	 }
    	 return factorial;
     }
}
