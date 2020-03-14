package Kattis;

import java.util.Scanner;

public class Läxa3_R2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int R1 = 0, s = 0;
		//Skriver ut ett tal.
		System.out.println("Skriv ett tal");
		R1 = input.nextInt();
		//Skriver ut vad man vill svaret ska bli.
		System.out.println("Skriv vad du vill svaret ska bli");
		s = input.nextInt();
		//Skriver ut svaret på R2.
		double R2 = (s*2 - R1);
		
		System.out.println("R1 is:\t" + R1);
		System.out.println("S is:\t" + s);
		System.out.println("\nR2 is:\t" + R2);
		
		
	}
}
