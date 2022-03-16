import java.util.Scanner;

public class SpecialCaseScanner {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your age? ");
		int age = input.nextInt();
		
		input.nextLine(); // special case
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		System.out.println("Hello, " + name);
		System.out.println("You are " + age + " years old");
	}
}

