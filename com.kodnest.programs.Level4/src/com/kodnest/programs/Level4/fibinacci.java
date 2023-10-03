package com.kodnest.programs.Level4;

public class fibinacci {
    public void fibbi(int num) {
    	int num1=0;
    	int num2=1;
    	if(num==1) {
    		System.out.println(num1);
    	}
    	else if(num==2) {
    		System.out.println(num1+" "+num2);
    	}
    	else {
    		System.out.print(num1+" "+num2+" ");
    		for(int i=3;i<=num;i++) {
    			int fibbi=num1+num2;
    			System.out.print(fibbi+" ");
    			num1=num2;
    			num2=fibbi;
    		}
    	}
    	
    }
}
