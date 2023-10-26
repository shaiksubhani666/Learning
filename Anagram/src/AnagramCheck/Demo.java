package AnagramCheck;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char arr[]=str.toCharArray();
    String str1=sc.next();
    char arr1[]=str1.toCharArray();

     Arrays.sort(arr);
     Arrays.sort(arr1);
     if(arr.length==arr1.length || arr.length!=arr1.length) {
    	 if(Arrays.equals(arr, arr1)) {
    		 System.out.println("Anagram");
    	 }
    	 else {
    		 System.out.println("Not Anagram ");
    	 }
     }
     
     

    
}
}
