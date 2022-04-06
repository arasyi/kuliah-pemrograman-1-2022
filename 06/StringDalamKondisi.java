import java.util.Scanner;

public class StringDalamKondisi {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan nama buah yang kamu sukai: ");
		String buah = in.next();
		
		//if (buah == "apel") {
		//if (buah.equals("apel")) {
		//if (buah.equalsIgnoreCase("apel")) {
		if ("apel".equalsIgnoreCase(buah)) {
			System.out.println("Saya juga suka buah apel");
		} else {
			System.out.println("Kamu suka buah " + buah + "?");
			System.out.println("Kalau saya suka buah apel");
		}
	}
}

