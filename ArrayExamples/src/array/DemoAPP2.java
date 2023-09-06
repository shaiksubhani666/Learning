package array;

import java.util.Scanner;

public class DemoAPP2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    float []players=new float[8];
    for(int i=0;i<=players.length-1;i++) {
    	System.out.println("Enter the height of the players"+i);
    	players[i]=sc.nextFloat();
    }
    System.out.println("Heigths of the playes are");
    for(int i=0;i<=players.length-1;i++) {
    	System.out.print(players[i]+" ");
    }
}
}
