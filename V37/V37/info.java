package V37;

import java.util.Scanner;

public class info {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Vad heter du? "); //skriver utt ett meddelande
		
		String namn1 = input.nextLine(); // läser in ett namn från konsolen
		
		System.out.println("Hur gammal är du? ");
		
		String namn2 = input.nextLine();
		
		System.out.println("Vad är din adress? ");
		
		String namn3 = input.nextLine();
		
		System.out.println("Vad är ditt postnummer? ");
		
		String namn4 = input.nextLine();
		
		System.out.println("Vilken stad bor du i? ");
		
		String namn5 = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer? ");
		
		String namn6 = input.nextLine();
		
		System.out.println("\nINFORMATION:");
		
		System.out.println("\nNAMN:\t\t" + namn1 + "\nÅLDER:\t\t" + namn2 + "\nADRESS:\t\t" + namn3 + "\n\t\t" + namn4 + "\t" + namn5 + "\nTELEFON:\t" + namn6);
		
	}

}
