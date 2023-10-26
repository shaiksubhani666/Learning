package AnagramCheck;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char arr[]=str.toCharArray();
	
	String str1=sc.next();
	char arr1[]=str1.toCharArray();
	Arrays.sort(arr);
	Arrays.sort(arr1);
	for(int i=0;i<=arr.length-1;i++) {
		if(arr.length==arr1.length&& Arrays.equals(arr1,arr)) {
			System.out.println("Anagram");
			break;
		}
		else {
			System.out.println("Non Anagram");
			break;
			
		}
	}

	
}
}
