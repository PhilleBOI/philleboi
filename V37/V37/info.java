package V37;

import java.util.Scanner;

public class info {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Vad heter du? "); //skriver utt ett meddelande
		
		String namn1 = input.nextLine(); // l�ser in ett namn fr�n konsolen
		
		System.out.println("Hur gammal �r du? ");
		
		String namn2 = input.nextLine();
		
		System.out.println("Vad �r din adress? ");
		
		String namn3 = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer? ");
		
		String namn4 = input.nextLine();
		
		System.out.println("Vilken stad bor du i? ");
		
		String namn5 = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer? ");
		
		String namn6 = input.nextLine();
		
		System.out.println("\nINFORMATION:");
		
		System.out.println("\nNAMN:\t\t" + namn1 + "\n�LDER:\t\t" + namn2 + "\nADRESS:\t\t" + namn3 + "\n\t\t" + namn4 + "\t" + namn5 + "\nTELEFON:\t" + namn6);
		
	}

}
