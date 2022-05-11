public class NestedLoop {
	
	public static void main (String[] args) {
		loop_luar:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break loop_luar;
				}
				System.out.println(i + "-" + j);
			}
			// after inner loop
		}
	}
}
