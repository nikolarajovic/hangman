package project_2022;

import java.util.Scanner;

public class hangman {

	public static void seperation(String word, char[] letters) {
		for (int i = 0; i < letters.length; i++) {
			letters[i] = word.charAt(i);
		}
	}
	
	public static void print(char[] letters, boolean[] guessed) {
		for (int i = 0; i < letters.length; i++) {
			if (guessed[i] == false) {
				System.out.print("_ ");
			} else {
				System.out.print(letters[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static void hangmanPrint(int error) {
		switch (error) {
		case 0:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 1:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 2:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|           |");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 3:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|        ---|");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 4:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|        ---|---");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 5:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|        ---|---");
			System.out.println("|          / ");
			System.out.println("|         /  ");
			System.out.println("|            ");
			System.out.println();
			break;
		case 6:
			System.out.println("_____________");
			System.out.println("|           |");
			System.out.println("|           O");
			System.out.println("|        ---|---");
			System.out.println("|          / \\");
			System.out.println("|         /   \\");
			System.out.println("|            ");
			System.out.println();
			break;
		default:
			break;
		}
	}
	
	public static void bingo(char guess, char[] letters, boolean[] guessed) {
		for (int i = 0; i < guessed.length; i++) {
			if (guess == letters[i]) {
				guessed[i] = true;
			}
		}
	}
	
	public static boolean isGuessed(char guess, char[] letters) {
		int count = 0;
		for (int i = 0; i < letters.length; i++) {
			if (guess == letters[i]) {
				count++;
			}
		}
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*** WELCOME TO HANGMAN ***");
		System.out.print("\nEnter the word: ");
		String word = s.nextLine();

		char[] letters = new char[word.length()];

		boolean[] guessed = new boolean[word.length()];

		int errors = 0;

		seperation(word, letters);

		hangmanPrint(errors);
		print(letters, guessed);
		System.out.print("\nEnter the letter: ");
		char guess = s.next().charAt(0);

	}

}
