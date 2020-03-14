package V43;

import java.util.Scanner;

public class Läxa_5_ageControl {

	public static void main(String[] args) {
		
		int age = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in en ålder");
		age = input.nextInt();
		
		if (age <= 5) {
			
			System.out.println("Småbarn får inte göra något.");
		}
		
		else if (age >=6 && age <= 12) {
			
			System.out.println("Du får spela Fortnite.");
		}
		
		else if (age >= 13 && age <= 14) {
			
			System.out.println("Du är tonåring.");
		}
		
		else if (age >= 15 && age <= 17) {
			
			System.out.println("Du får köra moppe.");
		}
		
		else if (age >= 18 && age <= 20) {
			
			System.out.println("Du får köra bil.");
		}
		
		else if (age >= 21 && age <= 64) {
			
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		}
		
		else if (age >= 65 && age <= 99) {
			
			System.out.println("Du är pensionär.");
		}
		
		else {
			
			System.out.println("R.I.P?");
		}

	}

}
