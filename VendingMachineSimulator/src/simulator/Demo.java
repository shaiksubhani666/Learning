//Vending Machine Simulator

//Question Description: Create a program that simulates a vending machine.
//The program should take a product code as input and output the product name.
package simulator;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code:");
		String code = sc.next();
		getProduct(code);

	}

	public static void getProduct(String code) {
		switch (code) {
		case "PO1":
			System.out.println("Coco cola");
			break;
		case "PO2":
			System.out.println("Fanta");
			break;
		case "PO3":
			System.out.println("Merinda");
			break;
		case "PO4":
			System.out.println("Mountain Due");
			break;
		case "PO5":
			System.out.println("MaaZa");
			break;
		default:
			System.out.println("Panaka");

		}

	}
}
