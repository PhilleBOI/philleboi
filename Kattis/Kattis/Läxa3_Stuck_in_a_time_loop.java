package Kattis;
import java.util.Scanner;

public class L�xa3_Stuck_in_a_time_loop {

	public static void main(String[] args) {
		
		int n = 0;
		//Skriver in antal m�nga g�nger som "(Siffra) Abracadabra" ska skrivas
		System.out.println("Skriv s� m�nga tal som du vill ska skrivas ut:");
		Scanner input = new Scanner(System.in);
		
		//Skriver ut "(Siffra) Abracadabra"
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
		
			System.out.println(i + " Abracadabra ");

		}
	}
}
