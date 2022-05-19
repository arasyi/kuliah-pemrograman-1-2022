public class BMI {
	
	/**
	 * Menghitung Body Mass Index (BMI)
	 * 
	 * @param weight berat badan dalam kilogram (kg)
	 * @param height tinggi badan dalam meter (m)
	 * @return hasil perhitungan BMI
	 */
	public static double computeBMI(double weight, double height) {
		double bmi = weight / height / height;
		
		return bmi;
	}
	
	public static void main(String[] args) {
		double weightAni = 40;
		double heightAni = 1.65;
		
		double bmiAni = computeBMI(weightAni, heightAni);
		
		System.out.println("Ani's BMI is " + bmiAni);
		System.out.println(weightAni);
	}
}
