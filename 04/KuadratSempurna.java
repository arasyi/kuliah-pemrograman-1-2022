import java.util.Scanner;

public class KuadratSempurna {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan bilangan bulat: ");
		int bilangan = in.nextInt();
		
		double akar = Math.sqrt(bilangan);
		System.out.println("Akar kuadrat = " + akar);
		
		double koma = akar % 1;
		System.out.println("Koma = " + koma);
		
		if (koma == 0.0) {
			System.out.printf("%d adalah bilangan kuadrat sempurna\n", bilangan);
		} else {
			System.out.printf("%d bukan bilangan kuadrat sempurna\n", bilangan);
		}
	}
}

