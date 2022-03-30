import java.util.Scanner;

public class DurasiBelajar {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan waktu mulai belajar (jam menit): ");
		int jamMulai = in.nextInt();
		int menitMulai = in.nextInt();
		
		System.out.print("Masukkan waktu selesai belajar (jam menit): ");
		int jamSelesai = in.nextInt();
		int menitSelesai = in.nextInt();
		
		System.out.printf(
			"Waktu belajar Ani: %d:%d - %d:%d\n", 
			jamMulai, menitMulai, jamSelesai, menitSelesai
		);
		
		int durasi = 
			  (jamSelesai * 60 + menitSelesai) 
			- (jamMulai * 60 + menitMulai);
		  
		System.out.printf(
			"Ani belajar selama %d menit\n", 
			durasi
		);
		
		if (durasi > 120) {
			System.out.println("Ani adalah anak yang rajin");
		} else if (durasi <= 40) {
			System.out.println("Ani adalah anak yang malas");
		}
	}
}

