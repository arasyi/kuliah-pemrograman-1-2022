import java.util.Scanner;

public class PrimaAtauBukan {
	public static int hitungBanyakFaktor(int n) {
		int faktor = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				faktor++;
			}
		}
		return faktor;
	}

	/**
	 * Menentukan apakah sebuah bilangan bulat positif merupakan
	 * bilangan prima atau bukan
	 * 
	 * @param n bilangan bulat positif
	 * @return apakah n merupakan bilangan prima atau bukan
	 */
	public static boolean isPrima(int n) {
		int faktor = hitungBanyakFaktor(n);
		if (faktor == 2) {
			return true;
		}
		return false;

		// alternatif:
		// return faktor == 2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();

		if (isPrima(n)) {
			System.out.println(n + " merupakan bilangan prima");
		} else {
			System.out.println(n + " bukan merupakan bilangan prima");
		}
	}
}
