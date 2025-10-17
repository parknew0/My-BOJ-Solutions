import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer n
        int n = sc.nextInt();

        while (true) {
            // Read the number from the list
            int num = sc.nextInt();

            // If the number is 0, terminate the loop
            if (num == 0) {
                break;
            }

            // Check if the number is a multiple of n
            if (num % n == 0) {
                System.out.println(num + " is a multiple of " + n + ".");
            } else {
                System.out.println(num + " is NOT a multiple of " + n + ".");
            }
        }
        
        sc.close();
    }
}