import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int minSolved = N - (M * K);
        int maxSolved = N - (M * (K - 1)) - 1;

        if (minSolved < 0) {
            minSolved = 0;
        }

        System.out.println(minSolved + " " + maxSolved);

        scanner.close();
    }
}