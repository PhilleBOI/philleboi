package V43;

import java.util.Scanner;

public class L�xa_5_ageControl {

	public static void main(String[] args) {
		
		int age = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in en �lder");
		age = input.nextInt();
		
		if (age <= 5) {
			
			System.out.println("Sm�barn f�r inte g�ra n�got.");
		}
		
		else if (age >=6 && age <= 12) {
			
			System.out.println("Du f�r spela Fortnite.");
		}
		
		else if (age >= 13 && age <= 14) {
			
			System.out.println("Du �r ton�ring.");
		}
		
		else if (age >= 15 && age <= 17) {
			
			System.out.println("Du f�r k�ra moppe.");
		}
		
		else if (age >= 18 && age <= 20) {
			
			System.out.println("Du f�r k�ra bil.");
		}
		
		else if (age >= 21 && age <= 64) {
			
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt.");
		}
		
		else if (age >= 65 && age <= 99) {
			
			System.out.println("Du �r pension�r.");
		}
		
		else {
			
			System.out.println("R.I.P?");
		}

	}

}
