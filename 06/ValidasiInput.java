import java.util.Scanner;

public class ValidasiInput {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Sisi kubus = ");
		
		// FAIL FAST
		if (!in.hasNextDouble()) {
			String input = in.next();
			System.out.println(input + " bukan merupakan nilai yang valid.");
			System.out.println("Nilai harus berupa bilangan desimal.");
			
			// System.exit(0);
			return;
		}
		
		double sisi = in.nextDouble();
		
		if (sisi <= 0) {
			System.out.println("Sisi kubus harus positif");
			return;
		}
		
		double volume = sisi * sisi * sisi;
		System.out.println("Volume = " + volume);
		
		
		// NESTED IFs
		//if (in.hasNextDouble()) {
			//double sisi = in.nextDouble();
			
			//if (sisi > 0) {
				//double volume = sisi * sisi * sisi;
				//System.out.println("Volume = " + volume);
			//} else {
				//System.out.println("Sisi kubus harus positif");
			//}
		//} else {
			//String input = in.next();
			//System.out.println(input + " bukan merupakan nilai yang valid.");
			//System.out.println("Nilai harus berupa bilangan desimal.");
		//}
	}
}

