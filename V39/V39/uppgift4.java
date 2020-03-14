package V39;
import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Scanner input = new Scanner(System.in);
		int tal = 0;
		float sum;

		System.out.println("\nSkriv ett tall mellan 0-10");
		tal = input.nextInt();
			
		for (int j = 1; j <=10; j++) {
				System.out.print(tal * j + " ");
		}
	}

}
