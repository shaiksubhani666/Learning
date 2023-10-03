package com.kodnest.programs.Level4;

public class primeNumber {
    public void printPrime(int num) {
	  for(int i=3;i<=num;i++) {
		  boolean res= CheckPrime(i);
		  if(res==true){
			  System.out.print(i+" ");
		  }
	  }
	  
  }
  boolean CheckPrime(int num) {
	  for(int i=2;i<num;i++) {
		  if(num%i==0){
			  return false;
		  }
		  
	  }
	  return true;
  }
}
