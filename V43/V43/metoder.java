package V43;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		
		twoNumbers();
		
	}
	
	/**
	 * Skriver tv� heltal coh skickar de vidare.
	 */
	public static void twoNumbers() {
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("V�nligen skriv in tv� heltal: ");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstaTal (tal1, tal2));
	}
	
/**
 * J�mf�r tv� heltal och utv�rderar vilket som �r minst. Samt skickar tillbaka en h�lsning.
 * @param tal3 Heltal1
 * @param tal4 Heltal2
 * @return String hej
 */
		 public static String minstaTal(int tal3, int tal4) {
			
			System.out.println("tal1:\t" + tal3 + "\ntal2:\t" + tal4);
			
			if (tal3 <= tal4) {
				System.out.println("Minsta talet �r: " + tal3);
			}
			else {
				System.out.println("Minsta talet: " + tal4);
			}
			
			String hej = "Metoden �r klar";
			
			return hej;
			
	}
}
