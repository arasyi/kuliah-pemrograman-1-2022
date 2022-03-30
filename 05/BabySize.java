import java.util.Scanner;

public class BabySize {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the baby's weight in kg: ");
		double weight = in.nextDouble();
		
		System.out.print("Enter the baby's length in cm: ");
		int length = in.nextInt();
		
		if (
			(2.5 <= weight && weight <= 4.5) // normal weight
						&&
			(45 <= length && length <= 60) // normal length 
		) {
			System.out.println("The baby's size is normal");
		} else {
			System.out.println("The baby's size is not normal");
		}
	}
}

