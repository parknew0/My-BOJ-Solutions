import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // Print the top half of the diamond (including the middle row)
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the bottom half of the diamond
        for (int i = N - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}