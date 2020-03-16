import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Philip"); //På index 0
		nameList.add("Linus"); //På index 1
		nameList.add(1, "Petter"); //Bytter plats på index 1
		
		for (int i = 0; i < nameList.size(); i++) { // Skriver ut ArrayList innehållet mha .size() + .get()
			System.out.println(nameList.get(i));
			
			
			
		}
		System.out.println();
		
		nameList.remove("Philip");
		
		for (int i = 0; i < nameList.size(); i++) { // Skriver ut ArrayList innehållet mha .size() + .get()
			System.out.println(nameList.get(i));
		
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			numbers.add(i*i);
		}
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println(numbers);
		
		
	}

}
