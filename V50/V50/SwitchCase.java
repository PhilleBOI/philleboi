package V50;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int choice;

		System.out.println("Välkommen, välj något av dessa alternativ: ");
		System.out.println("(1) - New Game");
		System.out.println("(2) - Load game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Quit");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:

			System.out.println("Spelet Startar...");

			break;

		case 2:

			System.out.println("Välj sparad mapp...");

			break;

		case 3:

			System.out.println("Ljud, Kotroller, Video");

			break;

		case 4:

			System.out.println("Philip Thilen");

			break;

		case 5:

			System.out.println("Spelet avslutar...");

			break;

		default:
			System.out.println("Välj en siffra, idiot...");
			break;
		}

	}

}
