package V37;

public class prova_sj�lv {

	public static void main(String[] args) {
		// Ett s�tt att skriva kommentarer
		/* Ett annat s�tt att skriva kommentarer
		 */
		
		// DATATYPER:
		// byte - heltal
		// long - j�ttestora heltal
		// int - heltal
		// double - decimaltal
		// short - decimaltal
		// float - decimaltal
		// char - tecken
		// boolean - true/false
		// String - 
				
				int heltal1 = 25; // skapar en l�da som heter heltal1 och fyller den med ett heltal
				int svar; // deklarera
				
				svar = heltal1*heltal1;
				
				System.out.println("Svar: " + heltal1*heltal1); // + tecknet kallas konkatinera
				
				double decimaltal1 = 75.7;
				double decimaltal2 = 150.9;
				int radie = 5;
				
				double omkrets = decimaltal1 + decimaltal2;
				
				System.out.println("Omkretsen �r: " + omkrets + "cm^2");
				
				long stortHeltal = 500000000000000000L;
				
				System.out.println(stortHeltal +1);
	}

}
