import java.util.Scanner;

public class Pengurutan {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan bilangan bulat ke-1: ");
		int a = in.nextInt();
		
		System.out.print("Masukkan bilangan bulat ke-2: ");
		int b = in.nextInt();
		
		System.out.print("Masukkan bilangan bulat ke-3: ");
		int c = in.nextInt();
		
		
		/*
		a b c
		a c b
		b a c 
		b c a
		c a b
		c b a
		*/
		
		//System.out.println("Urutan bilangan dari yang terkecil hingga terbesar:");
		
		//if (a < b && b < c) {
			//System.out.println(a);
			//System.out.println(b);
			//System.out.println(c);
		//} else if (a < c && c < b) {
			//System.out.println(a);
			//System.out.println(c);
			//System.out.println(b);
		//} else if (b < a && a < c) {
			//System.out.println(b);
			//System.out.println(a);
			//System.out.println(c);
		//} else if (b < c && c < a) {
			//System.out.println(b);
			//System.out.println(c);
			//System.out.println(a);
		//} else if (c < a && a < b) {
			//System.out.println(c);
			//System.out.println(a);
			//System.out.println(b);
		//} else {
			//System.out.println(c);
			//System.out.println(b);
			//System.out.println(a);
		//}
		
		int terbesar = a;
		if (terbesar < b) {
			terbesar = b;
		}
		if (terbesar < c) {
			terbesar = c;
		}
		
		int terkecil = a;
		if (terkecil > b) {
			terkecil = b;
		}
		if (terkecil > c) {
			terkecil = c;
		}
		
		int tengah = a + b + c - terbesar - terkecil;
		
		System.out.println("Urutan bilangan: ");
		System.out.println(terkecil);
		System.out.println(tengah);
		System.out.println(terbesar);
		
	}
}

