import java.util.Scanner;
public class LoopGanjil {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bilangan = in.nextInt();
		
		for (int i = 1; i <= bilangan; i += 2) { // i = i + 2
			//if (i%2 == 1) {
				System.out.print(" " + i);
			//}
		}
		
		System.out.println();
	}
}

