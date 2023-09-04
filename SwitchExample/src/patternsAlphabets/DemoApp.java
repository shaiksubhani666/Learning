package patternsAlphabets;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		int n=5;
		
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Charector to print");
   char ch=sc.next().charAt(0);
   Demo d=new Demo();
   d.patternA(ch);
   switch(ch) {
   case 'A':
	   d.patternA(ch);
	   break;
   case 'B':
	   d.patternB(ch);
	   break;
   case  'c':
	   d.patternC(ch);
	   break;
   case 'D':
	   d.patternD(ch);
	   break;
  
   case 'F':
	   d.patternF(ch);
	   break;
   case 'G':
	   d.patternG(ch);
	   break;
   case 'H':
	   d.patternH(ch);
	   break;
   case 'I':
	   d.patternI(ch);
	   break;
   case 'K':
	   d.patternK(ch);
	   break;
   case 'L':
	   d.patternL(ch);
	   break;
   case 'M':
	   d.patternM(ch);
	   break;
   case 'N':
	   d.patternN(ch);
	   break;
   case 'O':
	   d.patternO(ch);
	   break;
   case 'P':
	   d.patternP(ch);
	   break;
   case 'R':
	   d.patternR(ch);
	   break;
   case 'S':
	   d.patternS(ch);
	   break;
   case 'T':
	   d.patternT(ch);
	   break;
   case 'V':
	   d.patternV(ch);
	   break;
   case 'w':
	   d.patternW(ch);
	   break;
   case 'X':
	   d.patternX(ch);
	   break;
   case 'Y':
	   d.patternY(ch);
	   break;
   case 'Z':
	   d.patternZ(ch);
	   break;
	   
   }
   
	}

}
