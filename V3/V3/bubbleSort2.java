package V3;

import java.util.Arrays;

public class bubbleSort2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[37];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*1000);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
		
			swapped = false;	// nollst�ller swapped i b�rjan p� j�mf�relsen.
		
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {	// Byter plats p� tv� intilliggande tal.													
					temp = numbers[i]; //Sparar tillf�lligt v�rde p� v�nstra sidan.
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));
		
	}
}