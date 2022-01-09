package project_2022;

import java.util.Scanner;

public class hangman {

	public static void seperation(String word, char[] letters) {
		for (int i = 0; i < letters.length; i++) {
			letters[i] = word.charAt(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*** WELCOME TO HANGMAN ***");
		System.out.print("\nEnter the word: ");
		String word = s.nextLine();

		char[] letters = new char[word.length()];

		boolean[] guessed = new boolean[word.length()];

		seperation(word, letters);
	}

}
