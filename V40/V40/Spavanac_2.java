package V40;

import java.util.Scanner;

public class Spavanac_2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int hours = 0;
		int minutes = 0;
		int resulthours = 0;
		int resultmins = 0;
		
		System.out.println("Say what hour he is suppose to wake upp (OBS! 24-hour notation)");
		hours = input.nextInt();
		
		System.out.println("Say what minutes he is suppose to wake upp (OBS! 24-hour notation)");
		minutes = input.nextInt();
		
		int totalmins = (hours*60) + minutes;
		totalmins = totalmins - 45;
		resultmins = totalmins % 60;
		resulthours = totalmins - resultmins;
		resulthours = resulthours/60;
		
		System.out.println(resulthours + resultmins);
		
	}
}
