package uppgifter;

import java.util.Scanner;

public class Lektionsuppgifter {

	public static void main(String[] args) {
		
		int digit;
		int number;
		int sum = 0;
		
		Scanner input = new Scanner (System.in);
				
		System.out.println("Skriv ett heltal: ");
		
		number = input.nextInt();
		
		while(number != 0) {
			
			digit = number % 10;
			sum += digit;
			number = number/10; // (number /= 10) funkar också.

		}
		System.out.println(sum);
	}
}
