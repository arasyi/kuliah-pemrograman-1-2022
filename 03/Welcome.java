import java.util.Scanner;
public class Welcome {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your name (again): ");
		String name2 = input.next();
		
		String message = "Welcome " + name + "!";
		System.out.println(message);
		
		System.out.println("name2 = " + name2);
		
		System.out.print("Enter your age: ");
		//int age = Integer.parseInt(input.nextLine());
		int age = input.nextInt();
		
		System.out.println("You are " + age + " years old");
	}
}

