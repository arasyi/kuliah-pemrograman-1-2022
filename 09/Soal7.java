import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        // soal 7
        Scanner in = new Scanner(System.in);
        System.out.print("Tanggal = ");
        int tanggal = in.nextInt(); // input
        System.out.print("Bulan = ");
        int bulan = in.nextInt();
        System.out.print("Tahun = ");
        int tahun = in.nextInt();
        
        int hari = 365;
        int hariFeb = 28;
        if (tahun % 400 == 0 || (tahun % 100 != 0 && tahun % 4 == 0)) {
            hari = 366;
            hariFeb = 29;
        }
        
        //int sisa = hari;
        //if (bulan == 1) {
            //sisa = hari - tanggal;
        //} else if (bulan == 2) {
            //sisa = hari - 31 - tanggal;
        //} else if (bulan == 3) {
            //sisa = hari - 31 - hariFeb - tanggal;
        //} else if (bulan == 4) {
			//sisa = hari - 31 - hariFeb - 31 - tanggal;
		//}
		
		int sisa = hari;
		if (bulan > 1) {
            sisa = sisa - 31;
        }
        if (bulan > 2) {
            sisa = sisa - hariFeb;
        }
        if (bulan > 3) {
            sisa = sisa - 31;
        }
        if (bulan > 4) {
            sisa = sisa - 30;
        }
        if (bulan > 5) {
            sisa = sisa - 31;
        }
        if (bulan > 6) {
            sisa = sisa - 30;
        }
        if (bulan > 7) {
            sisa = sisa - 31;
        }
        if (bulan > 8) {
            sisa = sisa - 31;
        }
        if (bulan > 9) {
            sisa = sisa - 30;
        }
        if (bulan > 10) {
            sisa = sisa - 31;
        }
        if (bulan > 11) {
            sisa = sisa - 30;
        }
        
        sisa = sisa - tanggal;
        
        System.out.println("Sisa hari = " + sisa);
        
    }
}
