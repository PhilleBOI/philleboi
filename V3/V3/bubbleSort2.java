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
		
			swapped = false;	// nollställer swapped i början på jämförelsen.
		
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {	// Byter plats på två intilliggande tal.													
					temp = numbers[i]; //Sparar tillfälligt värde på vänstra sidan.
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));
		
	}
}