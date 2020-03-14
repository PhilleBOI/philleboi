package Kattis;
import java.util.Scanner;

public class Läxa3_Stuck_in_a_time_loop {

	public static void main(String[] args) {
		
		int n = 0;
		//Skriver in antal många gånger som "(Siffra) Abracadabra" ska skrivas
		System.out.println("Skriv så många tal som du vill ska skrivas ut:");
		Scanner input = new Scanner(System.in);
		
		//Skriver ut "(Siffra) Abracadabra"
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
		
			System.out.println(i + " Abracadabra ");

		}
	}
}
