import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = N / M;
        if (N % M != 0) {
            result++;
        }

        System.out.println(result);
        sc.close();
    }
}