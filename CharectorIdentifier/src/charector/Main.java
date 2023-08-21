//Create a program that identifies a character as a lower-case vowel,
//upper-case vowel, lower-case consonant, upper-case consonant, digit, or special character.
//The program should accept a character 'ch' as input.

package charector;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Cherector");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);

	}

	public static void identifyCharacter(char ch) {
		if (Character.isUpperCase(ch)) {
			System.out.println("Character is in Uppercase:!");

		} else {
			System.out.println("Charecter is in LowerCase:!");
		}

	}
}
