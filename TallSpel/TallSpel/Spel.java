package TallSpel;

import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {

		String exit = "exit";
		System.out.println("Press 'Enter' to start." + "\nWrite 'exit' to quit the game.");

		Scanner input = new Scanner(System.in);

		String Start = input.nextLine();

		if (Start.equals(exit)) {
			System.out.println("Exited game.");
		}
		
		else {

		int guess;
		int choice;
		double number;
		int talet;
		boolean choice = false;
		
		System.out.println("Difficulty");
		System.out.println("(1) - Easy (20 trys, a number betwen 0-20)");
		System.out.println("(2) - Normal (10 trys, a number betwen 0-50)");
		System.out.println("(3) - Hard (5 trys, a number betwen 0-100)");
		choice = input.nextInt();
			
		while (!choice) {
		int trys;
		int i;

		
		
		switch (choice) {
		case 1:

			trys = 20;
			i = 0;

			System.out.println("You chose Easy.");

			number = Math.floor(Math.random() * 20);
			talet = (int) number;

			if (i == trys) {
				System.out.println("Out of trys, better luck next time.");
				break;
			}

			for (i = 0; i < trys; i++) {
				System.out.println("Guess a number between 0-20:");
				guess = input.nextInt();

				if (guess < talet) {
					System.out.println("Guess higher:");
				}

				if (guess > talet) {
					System.out.println("Guess lower:");
				}

				if (guess == talet) {
					System.out.println("You guessed right, good job!");
					break;
				}
			}
			break;
		
		case 2:

			System.out.println("You chose Normal.");

			trys = 10;
			i = 0;

			number = Math.floor(Math.random() * 10);
			talet = (int) number;

			if (i == trys) {
				System.out.println("Out of trys, better luck next time.");
				break;
			}

			for (i = 0; i < trys; i++) {
				System.out.println("Guess a number between 0-50:");
				guess = input.nextInt();

				if (guess < talet) {
					System.out.println("Guess higher:");
				}

				if (guess > talet) {
					System.out.println("Guess lower:");
				}

				if (guess == talet) {
					System.out.println("You guessed right, good job!");
					break;
				}
			}
			break;
			
		case 3:

			System.out.println("You chose Hard.");

			trys = 5;
			i = 0;

			number = Math.floor(Math.random() * 5);
			talet = (int) number;

			if (i == trys) {
				System.out.println("Out of trys, better luck next time.");
				break;
			}

			for (i = 0; i < trys; i++) {
				System.out.println("Guess a number between 0-100:");
				guess = input.nextInt();

				if (guess < talet) {
					System.out.println("Guess higher:");
				}

				if (guess > talet) {
					System.out.println("Guess lower:");
				}

				if (guess == talet) {
					System.out.println("You guessed right, good job!");
					break;
				}
			}
			String Yes = "Yes";
			String No = "No";
			String answer;
			
			System.out.println("Wanna play again" + "\nYes or No?");
			answer = input.toString();
			
			if (answer.equals(Yes)) {
				
			}
			
			else {
				
			}

			break;

		default:
			System.out.println("Pick a difficulty!");
			break;
			}
		}
	}
}