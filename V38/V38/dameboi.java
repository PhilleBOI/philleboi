package V38;
import java.util.Scanner;

public class dameboi {

	public static void main(String[] args) {
			
			int age = 0; // initierat variabel
			int replay;
			boolean repeat = true; //styr while-loopen
			
			Scanner input = new Scanner(System.in); //g�r det m�jligt att f� input fr�n konsolen
				
			while (repeat) {
			
				System.out.println("Hur gammal �r du?");
				age = input.nextInt();
				
				if (age >= 18) {
					
					System.out.println("�h nej inte en till idiot som f�r k�rkort!");
					System.out.println("Om du v�ljer att k�ra moppe ist�llet i denna �ldern s� �r du fan dum i hela huvudet!");
				}
				else if (age >= 15 && age < 18) {
					
					System.out.println("Fuck you din j�vel!!, inget k�rkort till dig, du kan end� inte k�ra haha.");
					System.out.println("Tyv�rr s� f�r du k�ra moppe men spella roll, du kommer end� d� i en trafikolycka.");
				}
				else {
					System.out.println("HAHA, fuck you du f�r inte g�ra ett skit, g� till mamma och gr�t!");
				}
				System.out.println("Vill du fr�ga om �lder igen? \nPress '1' om ja, '2' om nej.");
				
				replay = input.nextInt();
				
				if (replay != 1) { //styr ifall man ska avsluta spelet
						repeat = false;
						System.out.println("\nHa en �cklig dag :)");
			}
		}

	}
}
