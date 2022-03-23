import java.util.*;

public class Fever {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter temperature: ");
		double temperature = in.nextDouble();
		
		if (temperature > 37.0) { 
			System.out.println("Fever.");	
			System.out.println("You should go home.");
		} else if (temperature < 35.0) {
			System.out.println("Hypothermia.");	
			System.out.println("You should go to the hospital.");
		} else {
			System.out.println("Normal temperature.");	
			System.out.println("Welcome!");
		}
		// keluar dari if
	}
}

