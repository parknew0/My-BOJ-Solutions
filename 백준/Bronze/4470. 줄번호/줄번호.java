import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            System.out.println(i + ". " + line);
        }
        
        scanner.close();
    }
}