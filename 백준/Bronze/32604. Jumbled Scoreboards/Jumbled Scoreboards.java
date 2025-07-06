import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prevA = -1, prevB = -1;

        boolean isChronological = true;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (i > 0) {
                if (a < prevA || b < prevB) {
                    isChronological = false;
                    break;
                }
            }

            prevA = a;
            prevB = b;
        }

        System.out.println(isChronological ? "yes" : "no");
    }
}
