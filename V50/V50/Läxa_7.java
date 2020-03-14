package V50;

import java.util.Scanner;

public class Läxa_7 {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);

		System.out.println("Star Wars Battlefornt II");
		System.out.println("(1) - SINGLEPLAYER");
		System.out.println("(2) - MULTIPLAYER");
		System.out.println("(3) - OPTIONS");
		System.out.println("(4) - PROFILE");
		System.out.println("(5) - QUIT");
		System.out.println();

		int choice = input.nextInt();

		String genre;

		switch (choice) {
		case 1:
			genre = "SINGELPLAYER";
			System.out.println("SINGELPLAYER");
			System.out.println();
			System.out.println("1. CAMPAIGN");
			System.out.println("2. GALACTIC CONQUEST");
			System.out.println("3. INSTANT ACTION");
			System.out.println("4. CAREER");
			System.out.println();
			break;
		case 2:
			genre = "CAMPAIGN";
			System.out.println("CAMPAIGN");
			System.out.println();
			System.out.println("1. Training");
			System.out.println("2. Space Overview");
			System.out.println("3. New Game");
			System.out.println("4. Load");
			System.out.println();
			System.out.println("5. Credits");
			System.out.println();
			break;
		case 3:
			genre = "GALACTIC CONQUEST";
			System.out.println();
			System.out.println("");
			System.out.println();
			break;
		case 4:
			genre = "Comedy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Deadpool 2, av David Leitch");
			System.out.println("2. Dum och dummare, av Peter Farelly");
			System.out.println("3. Bridesmaid, av Paul Feig");
			System.out.println();
			break;
		case 5:
			genre = "Romance";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. The notebook, av Nick Cassavetes");
			System.out.println("2. The holidays, av Nancy Meyrs");
			System.out.println("3. Love Simon, av Greg Berlanti");
			System.out.println();
			break;
		case 6:
			genre = "Fantasy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
			System.out.println("2. Aquaman, av James Wan");
			System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
			System.out.println();
			break;
		case 7:
			System.out.println("Thank you for today!");
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}

		input.close();
	}

}