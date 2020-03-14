package V49;

import java.util.Arrays;

public class Läxa_6 {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		int antal7 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				antal7++;
			}

		}
		System.out.println("Antal 7:or: " + antal7);
		System.out.println("Antal Toms i names: " + numberOfToms(names));
		System.out.println("Nummret det finns flest respektive minst av i numbers: " + mostNumbers(numbers));
		System.out.println("Index av Dursilla: " + posOfDrusilla(names));
		System.out.println("Summan av alla jämna tal: " + sumOfNumbers(numbers));
	}

	private static int sumOfNumbers(int[] numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				
				sum += numbers[i];

			}

		}
		
		return sum;
	}

	private static int numberOfToms(String[] names) {
		int howManyToms = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				howManyToms++;
			}
		}
		return howManyToms;
	}

	private static int posOfDrusilla(String[] names) {

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Drusilla")) {
				return i;
			}
		}

		return 0;
	}

	private static int mostNumbers(int[] numbers) {
		int most = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}

			if (amount > max) {
				most = i;
				amount = max;
			}
		}

		return most;
	}

}