package string;

import java.util.Scanner;



public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	System.out.println(str);
	  String arr[]=str.split(" ");
	  
	  String reversedsentence="";
	  String revword="";
	       for(int k=0;k<=arr.length-1;k++) {
	          String word=arr[k];
	          char arr1[]=word.toCharArray();
	          char arr2[]=new char[arr1.length];
	          int j=arr2.length-1;
	          for(int i=0;i<=arr2.length-1;i++) {
	        	  arr2[j]=arr1[i];
	        	  j--;
	          }
	          revword=revword+new String(arr2)+" ";
	       }
	       reversedsentence=revword;
	       System.out.println(revword);
	       
	         
	          
	
	
	
	
	
	
}
}
