import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double n = scanner.nextDouble();

            if (n == 0) {
                break;
            }

            double processionSize = 1 + n + Math.pow(n, 2) + Math.pow(n, 3) + Math.pow(n, 4);
            System.out.printf("%.2f\n", processionSize);
        }

        scanner.close();
    }
}