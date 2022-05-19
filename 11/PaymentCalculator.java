import java.util.Scanner;

public class PaymentCalculator {
	public static double computeTax(double price) {
		double tax = 0;
		if (price > 100) {
			tax = 0.2 * price;
		}
		return tax;
	}
	
	public static double computePayment(double price) {
		return price + computeTax(price);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Item Price: ");
		double itemPrice = in.nextDouble();

		double payment = computePayment(itemPrice);
		System.out.println("Total payment: " + payment);
	}
}
