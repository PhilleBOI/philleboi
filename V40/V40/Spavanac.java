package V40;

import java.util.Scanner;

public class Spavanac {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// H = hours. M = minutes.
		int H = 0;
		int M = 0;
		int Min;
		
		System.out.println("Say what hour he is suppose to wake upp (OBS! 24-hour notation)");
		H = input.nextInt();
		System.out.println("Say what minutes he is suppose to wake upp (OBS! 24-hour notation)");
		M = input.nextInt();
		
		Min = M-45;
		
		if((H == 24 || H == 0) && Min < 0) {
			H = 23;
			Min = 60 + Min;
		}
		else if(Min < 0) {
			H += -1;
			Min = 60 + Min;
		}
		
		System.out.println(H + " " + Min);
		
	}

}
