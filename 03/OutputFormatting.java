public class OutputFormatting {
	
	public static void main (String[] args) {
		String name = "Ani";
		int age = 6;
		double saving = 1234567.89012345;
		
		System.out.printf("Name: %s %n", name);
		System.out.printf("Name: %10s %n", name);
		System.out.printf("Name: %-10s %n", name);
		
		System.out.printf("Age: %d years old %n", age);
		System.out.printf("Age: %2d years old %n", age);
		System.out.printf("Age: %02d years old %n", age);
		
		System.out.printf("Saving: Rp %f %n", saving);
		System.out.printf("Saving: Rp %.2f %n", saving);
		System.out.printf("Saving: Rp %12.2f %n", saving);
		System.out.printf("Saving: Rp %5.2f %n", saving);
		System.out.printf("Saving: Rp %,.2f %n", saving);
		
		//double sepertiga = 1.0 / 3;
		//System.out.println(sepertiga);
		//System.out.printf(
			//"Sepertiga = %.3f, %.2f", sepertiga, 2.3 / 3.4
		//);
	}
}

