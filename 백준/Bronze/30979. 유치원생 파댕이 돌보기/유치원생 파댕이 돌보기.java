import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int totalMinutes = 0;
        for (int i = 0; i < N; i++) {
            totalMinutes += sc.nextInt();
        }

        if (totalMinutes >= T) {
            System.out.println("Padaeng_i Happy");
        } else {
            System.out.println("Padaeng_i Cry");
        }
    }
}