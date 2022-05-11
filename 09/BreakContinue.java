public class BreakContinue {
	
	public static void main (String[] args) {
		int n = 10;
		while (n > 0) {
			n--;
			
			if (n == 7) {
				n = 0;
				continue;
			}
			
			System.out.println(n);
		}
		
		
		//for (int i = 0; i < 10; i++) {
			//if (i == 2) {
				//continue;
			//} else if (i == 7) {
				//break;
			//}
			//System.out.println(i);
		//}
		// after loop
	}
}
