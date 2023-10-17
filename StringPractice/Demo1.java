package StringPractice;

import java.util.Scanner;

public class Demo1 {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str1=sc.next();
	  String str2=sc.next();
	  System.out.println(str1.length()+str2.length());
	  int res=str1.compareTo(str2);
	  if(res>0) {
		  System.out.println("Yes");
	  }
	  else if(res<0) {
		  System.out.println("No");
	  }
	  else {
		  System.out.println("They are Equal");
	  }
	  StringBuffer sb=new StringBuffer();
	  System.out.println(sb.append(str1+" "+str2));
	  str1=sb.toString();
	  char arr1[]=str1.toCharArray();
	  int tem=arr1[0];
	  if(tem>=97 && tem<=122) {
		  tem-=32;
	  }
	  arr1[0]=(char)tem;
	  for(int i=0;i<=arr1.length-1;i++) {
		  if(arr1[i]==' ') {
			  int help=arr1[i+1];
			  if(help>=97 && help<=122) {
				  help-=32;
			  }
			  arr1[i+1]=(char)help;
			 
		  }
	  }
	  str1=new String(arr1);
	  System.out.println(str1);
	  
	  
}
}
