package V45;

import java.util.Scanner;

public class mathtring {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2) + 4));
		System.out.println(svar);
		
		System.out.println(Math.PI);
	
		Math.max(3,7);
		
		String mening = "Tomas är dum men taskig!";
		System.out.println(mening);
		
		Scanner input = new Scanner(System.in);
		
		String mening2 = input.nextLine();
		
			if(mening.equals(mening2)) {
				System.out.println("samma mening");	
		}
		
			System.out.println(mening.length());
			System.out.println(mening.toUpperCase());
			System.out.println("TomAs KaN INte sTavA".toLowerCase());
			System.out.println("Tomas är dum!".contains("Tomas"));
			System.out.println("	To mas ä r du m		".trim());
			System.out.println("	ToMas Är dUm		".trim().toLowerCase());
			System.out.println("Tomas är bra".replace('a', 'B'));
			
			int a = 7;
			int b = 3;
			System.out.println(a/b);
			
			double answer = (double) a / (double) b;
			System.out.println(answer);
			
	}

}
