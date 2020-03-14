package V46;

import java.util.Scanner;

public class F_kelvin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in fahrenheit som du vill se i kelvin:");
		double fahrenheit = input.nextDouble();
		System.out.println(fahrenheitToKelvin(fahrenheit));
		
		System.out.println("Skriv in kelvin som du vill se i celcius:");
		double kelvin = input.nextDouble();
		System.out.println(kelvinToCelsius(kelvin));
		
		System.out.println("Skriv Km/h för att det i m/s:");
		double velocityKmH = input.nextDouble();
		System.out.println(velocityConversion(velocityKmH));
	
		System.out.println("Skriv in massan först, sen velocityn för att se KineticEnergin:");
		double mass = input.nextDouble();
		double velocity = input.nextDouble();
		System.out.println(kineticEnergi(mass, velocity));
		
		System.out.println("Skriv in massa och höjd för att se den potensiella energin:");
		double Mass = input.nextDouble();
		double height = input.nextDouble();
		System.out.println(potentialEnergy(Mass, height));
	}
		
	public static double fahrenheitToKelvin(double fahrenheit) {
		
		double kelvin = (fahrenheit+459.67)*5/9;
		
		return kelvin;

	}
	
	public static double kelvinToCelsius(double kelvin) {
		
		double celsius = kelvin-273.15;
		
		return celsius;
	}
	
	public static double velocityConversion(double velocityKmH) {
		
		double conversion = velocityKmH/3.6;
		
		return conversion;
	}
	
	public static double kineticEnergi(double mass, double velocity) {
		
		double result = mass + velocity;
				
		return result;
	}
	
	public static double potentialEnergy(double Mass, double height) {
	
		double potentialEnergy = Mass*9.8*height;
		
		return potentialEnergy;
	}

}
