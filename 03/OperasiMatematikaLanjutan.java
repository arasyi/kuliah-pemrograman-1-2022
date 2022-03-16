public class OperasiMatematikaLanjutan {
	
	public static void main (String[] args) {
		double n = 5;
		double power = 4;
		double nPower = Math.pow(n, power);
		System.out.println(
			n + " to the " + power + "th power = " + nPower
		);
		System.out.println(
			"Ini adalah nilai acak: " + Math.random()
		);
		System.out.println(
			"ln(10) = " + Math.log(10)
		);
		System.out.println(
			"log(10) = " + Math.log10(10)
		);
		
		
		double a = 3.75, b = 2.5;
		// int r = a / b;
		// int s = (int) a / b;
		int t = (int) (a / b);
	}
}

