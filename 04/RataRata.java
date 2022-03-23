import java.util.Scanner;

public class RataRata {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan bilangan ke-1: ");
		int bil1 = in.nextInt();
		
		System.out.print("Masukkan bilangan ke-2: ");
		int bil2 = in.nextInt();
		
		System.out.print("Masukkan bilangan ke-3: ");
		int bil3 = in.nextInt();
		
		double rata2 = (bil1 + bil2 + bil3) / 3.0;
		//System.out.println("Rata-rata = " + rata2);
		System.out.printf("Rata-rata = %.2f\n", rata2);
	}
}

