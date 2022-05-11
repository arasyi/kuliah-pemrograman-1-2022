import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        // soal 6
        Scanner in = new Scanner(System.in);
        
        System.out.print("N = ");
        int N = in.nextInt(); // input
        
        for (int i = 0; i < N; i++) {
            // if (i % 5 == 0) {
            //     System.out.print("a");
            // } else if (i % 5 == 1) {
            //     System.out.print("b");
            // }
            // // c d e
            
            char abcde = (char) ('a' + (i % 5));
            System.out.print(abcde);
        }
        System.out.println();
    }
}
