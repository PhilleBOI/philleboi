package V40;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv");
		
		int fizz = 0;
		int buzz = 0;
		int total = 0;
		
		fizz = input.nextInt();
		buzz = input.nextInt();
		total = input.nextInt();
		
		for(int i = 1; i <= total; i++) {
			String out = "";
			
			if(i % fizz == 0) {
				out += "Fizz";
			}
			if(i % buzz == 0) {
				out += "Buzz";
			}
			if(!(i % fizz == 0) && !(i % buzz == 0)) {
				out += i;
			}
			
			System.out.println(out);
		}

	}

}
