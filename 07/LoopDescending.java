import java.util.Scanner;

public class LoopDescending {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = in.nextInt();
		
		//for (int i = n; i >= 1; i--) {
			//System.out.print(i + " ");
		//}
		
		int i = n;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
	}
}

