package V49;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Skappar en array och fyller den med 10 tal.

		int[] siffror2 = new int[10]; // Skappar en array med 10 tomma lådor.

		int[] summa = new int[10];

		for (int i = 0; i < siffror2.length; i++) { // fyller array2 med input från konsolen.
			siffror2[i] = input.nextInt();
		}

		for (int i = 0; i < summa.length; i++) {
			summa[i] = siffror1[i] + siffror2[i];
		}
		
		for (int i : siffror1) { // ett annat sätt att använda en for loop för array.
			System.out.println(i + ", ");
		}

		for (int i = 0; i < siffror1.length; i++) { // Loopar genom siffror1[] och skriver ut innehållet.

			System.out.println(siffror1[i]);
		}

		System.out.println();
		System.out.println(Arrays.toString(siffror1)); // alternativt sätt att skriva ut en array.

		for (int i : siffror1) { // ett annat sätt att använda en for loop för array.
			System.out.println(i);
		}
	}

}
