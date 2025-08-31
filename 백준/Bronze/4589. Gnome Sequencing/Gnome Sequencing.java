import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Gnomes:");
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int[] original = new int[]{a, b, c};
            int[] sorted = new int[]{a, b, c};
            Arrays.sort(sorted);

            boolean isOrdered = false;
            // Check for ascending order
            if (original[0] == sorted[0] && original[1] == sorted[1] && original[2] == sorted[2]) {
                isOrdered = true;
            }
            // Check for descending order
            if (original[0] == sorted[2] && original[1] == sorted[1] && original[2] == sorted[0]) {
                isOrdered = true;
            }

            if (isOrdered) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
        scanner.close();
    }
}