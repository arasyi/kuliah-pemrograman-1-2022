import java.util.Scanner;

public class DoWhileIntro {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		//double number;
		//do {
			//System.out.print("Enter a positive number: ");
			//number = in.nextDouble();
		//} while (number <= 0);
		
		//System.out.println("You entered " + number);
		
		
		//double number;
		//System.out.print("Enter a positive number: ");
		//number = in.nextDouble();
		double number = -10;
		while (number <= 0) {
			System.out.print("Enter a positive number: ");
			number = in.nextDouble();
		}
		
		System.out.println("You entered " + number);
	}
}

