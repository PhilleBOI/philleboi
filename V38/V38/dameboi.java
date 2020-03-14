package V38;
import java.util.Scanner;

public class dameboi {

	public static void main(String[] args) {
			
			int age = 0; // initierat variabel
			int replay;
			boolean repeat = true; //styr while-loopen
			
			Scanner input = new Scanner(System.in); //gör det möjligt att få input från konsolen
				
			while (repeat) {
			
				System.out.println("Hur gammal är du?");
				age = input.nextInt();
				
				if (age >= 18) {
					
					System.out.println("Åh nej inte en till idiot som får körkort!");
					System.out.println("Om du väljer att köra moppe istället i denna åldern så är du fan dum i hela huvudet!");
				}
				else if (age >= 15 && age < 18) {
					
					System.out.println("Fuck you din jävel!!, inget körkort till dig, du kan endå inte köra haha.");
					System.out.println("Tyvärr så får du köra moppe men spella roll, du kommer endå dö i en trafikolycka.");
				}
				else {
					System.out.println("HAHA, fuck you du får inte göra ett skit, gå till mamma och gråt!");
				}
				System.out.println("Vill du fråga om ålder igen? \nPress '1' om ja, '2' om nej.");
				
				replay = input.nextInt();
				
				if (replay != 1) { //styr ifall man ska avsluta spelet
						repeat = false;
						System.out.println("\nHa en äcklig dag :)");
			}
		}

	}
}
