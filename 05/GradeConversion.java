public class GradeConversion {
	
	public static void main (String[] args) {
		double grade = 61.5; // seharusnya input, bukan dihardcode di sini
		
		if (grade < 41) { // false saat grade >= 41
			System.out.println("E");
		} else if (grade < 56) { // false saat grade >= 56
			System.out.println("D");
		} else if (grade < 61) {
			System.out.println("C");
		}
	}
}

