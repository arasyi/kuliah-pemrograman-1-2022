public class BMI {
    public static double computeBMI(double weight, double height) {
        // weightAni = 10000;
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
