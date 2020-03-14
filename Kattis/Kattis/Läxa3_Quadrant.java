package Kattis;

import java.util.Scanner;

public class Läxa3_Quadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		//Skriver ut kordinaterna x och y.
		System.out.println("Skriv vad för kordinater du vill ha.");
		System.out.println("X =");
		x = input.nextInt();
		
		System.out.println("Y =");
		y = input.nextInt();
		
		//Skriver ut i vilken quadrant som kordinaterna hammnar på.
		if(x <= 0 && y >= 0) {
			
			System.out.println(2);
		}
		else if(x <= 0 && y <= 0) {
			
			System.out.println(3);
		}
		else if(x >= 0 && y >= 0) {
			
			System.out.println(1);
		}
		else if(x >= 0 && y <= 0) {
			
			System.out.println(4);
		}
	}

}
