package V43;

import java.util.Scanner;

public class L�xa_5_MaxTal {

	public static void main(String[] args) {
		
		max();

	}
		public static void max() {
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in tv� heltal: ");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstaTal (tal1, tal2));
	}
		
		public static String minstaTal(int tal3, int tal4) {
			
			if (tal3 >= tal4) {
				System.out.println("St�rsta talet �r: " + tal3);
			}
			else {
				System.out.println("St�rsta talet �r: " + tal4);
			}
			
			String hej = "Metoden �r klar";
			
			return hej;
		}
}
