package V38;  
import java.util.Scanner;

public class läxa2 {

	public static void main(final String[] args) {
			
			final Scanner input = new Scanner(System.in);
			int tal1= 0, tal2 = 0, tal3 = 0, tal4 = 0, tal5 = 0;
			float sum;
	
			System.out.println("Skriv 5 heltal");
			tal1 = input.nextInt();
			tal2 = input.nextInt();
			tal3 = input.nextInt();
			tal4 = input.nextInt();
			tal5 = input.nextInt();
			
			if (tal1 > tal2 && tal1 > tal3 && tal1 > tal4 && tal1 > tal5)
				System.out.println("Högst:" + tal1);
			else if (tal2 > tal1 && tal2 > tal3 && tal2 > tal4 && tal2 > tal5)
				System.out.println("Högst:" + tal2);
			else if (tal3 > tal1 && tal3 > tal2 && tal3 > tal4 && tal3 > tal5)
				System.out.println("Högst:" + tal3);
			else if (tal4 > tal1 && tal4 > tal2 && tal4 > tal3 && tal4 > tal5)
				System.out.println("Högst:" + tal4);
			else if (tal5 > tal1 && tal5 > tal2 && tal5 > tal3 && tal5 > tal4)
				System.out.println("Högst:" + tal5);
			else
				System.out.println("Högst: Alla tal är lika stora");
			
			if (tal1 < tal2 && tal1 < tal3 && tal1 < tal4 && tal1 < tal5)
				System.out.println("Lägst:" + tal1);
			else if (tal2 < tal1 && tal2 < tal3 && tal2 < tal4 && tal2 < tal5)
				System.out.println("Lägst:" + tal2);
			else if (tal3 < tal1 && tal3 < tal2 && tal3 < tal4 && tal3 < tal5)
				System.out.println("Lägst:" + tal3);
			else if (tal4 < tal1 && tal4 < tal2 && tal4 < tal3 && tal4 < tal5)
				System.out.println("Lägst:" + tal4);
			else if (tal5 < tal1 && tal5 < tal2 && tal5 < tal3 && tal5 < tal4)
				System.out.println("Lägst:" + tal5);
			else
				System.out.println("Lägst: Alla tal är lika låga");
			
			sum = (tal1 + tal2 + tal3 + tal4 + tal5);
			System.out.println("Medelvärde:" + (sum / 5));
	}
}