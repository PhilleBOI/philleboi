package V4;

import java.util.Arrays;

public class NewP {

	public static void main(String[] args) {
		
		int[] numbers = new int[37];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*1000);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
		
			swapped = false;
		
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {												
					temp = numbers[i]; 
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));

	}

}