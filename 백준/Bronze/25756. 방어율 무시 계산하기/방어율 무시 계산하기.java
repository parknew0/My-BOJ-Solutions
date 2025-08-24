import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double currentDefenseIgnore = 0.0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            double A_percent = A / 100.0;
            currentDefenseIgnore = 1 - (1 - currentDefenseIgnore) * (1 - A_percent);
            System.out.println(String.format("%.6f", currentDefenseIgnore * 100.0));
        }

        sc.close();
    }
}