package V3;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
				int[] numbers = {1,5,2,6,3,8,4,7,10,8,9,0};
		boolean swapped = true;
		int temp;
		
		System.out.println(Arrays.toString(numbers));
		
		do {
		
			swapped = false;	// nollställer swapped i början på jämförelsen
		
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {	// Byter plats på två intilliggande tal.													
					temp = numbers[i]; //Sparar tillfälligt värde på vänstra sidan.
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
					System.out.println(Arrays.toString(numbers));
				}
			}
		} while (swapped);

	}
}