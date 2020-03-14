package V50;

import java.util.Scanner;

public class PB_Losning {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		boolean success = false;

		System.out.println("Write an Integer: ");

		while (!success) {

			try {
				number = input.nextInt();
				System.out.println("The number is: " + number);
				success = true;

			} catch (Exception e) {
				input.next();
				System.out.println("You typed in wrong input, idiot");
			}
		}

		System.out.println("Nice!");
	}

}
