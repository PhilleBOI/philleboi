package V39;
import java.util.Scanner;

public class uppgift5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		do {
			String line = input.nextLine();
			if (line.equals("exit")) {
				exit = true;
			}
		}
		while (!exit);
	}

}
