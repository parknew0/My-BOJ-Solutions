import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int fizzBuzz = n / lcm(a, b);
        int fizz = n / a - fizzBuzz;
        int buzz = n / b - fizzBuzz;

        System.out.println(fizz + " " + buzz + " " + fizzBuzz);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    private static int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }
}
