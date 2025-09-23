import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (c == 0) {
            // a + b = c^2 이므로, c = sqrt(a + b)
            int result = (int) Math.sqrt(a + b);
            System.out.println(result);
        } else if (a == 0) {
            // a + b = c^2 이므로, a = c^2 - b
            int result = (c * c) - b;
            System.out.println(result);
        } else { // b == 0
            // a + b = c^2 이므로, b = c^2 - a
            int result = (c * c) - a;
            System.out.println(result);
        }
    }
}