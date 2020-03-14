package V40;

public class Lektion5 {

	public static void main(String[] args) {
		
		// % == modulus
		
		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = 137;
		
		System.out.println(tal1 % 3); //testar ifall tal är delbart med 3
									  // är den det så blir svar 0, om inte 
									  //så anges rest.
		int sum = 0;
		
		for (int i = 0; i < 101; i++) {
		
			if (i % 3 == 0) {
				System.out.println("talet" + i + "är delbart med 3");
				
				sum += i;
			}
			
		}
		
		System.out.println("The total of all integers divided by 3 is " + sum);
		
		int turn = 0;
		
		while (true) {
			
			turn++;
			
			if (turn % 3 == 0) {
				System.out.println("Maximilius turn");
			}
			
			else if (turn % 3 == 1) {
				System.out.println("Ludvigus turn");
				
			}
			
			else if (turn % 3 == 2) {
				System.out.println("Phillipos turn");
			}
			
			if (turn == 100); {
				break;
			}
		}
		
	}
}
