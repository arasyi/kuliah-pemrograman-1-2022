import java.util.Scanner;

public class WhileVsDoWhile {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = in.nextInt();
		int i;
		
		System.out.println("WHILE LOOP - START");
		i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
		System.out.println("WHILE LOOP - END");
		
		System.out.println("DO-WHILE LOOP - START");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= n);
		System.out.println("DO-WHILE LOOP - END");
		
	}
}

