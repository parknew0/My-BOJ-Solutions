import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the total amount on the receipt
        int X = sc.nextInt();

        // Read the number of different types of items
        int N = sc.nextInt();

        // Initialize a variable to store the calculated total sum
        long calculatedSum = 0; // Use long to prevent potential overflow for large sums

        // Loop N times to read each item's price and quantity
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // Price of the item
            int b = sc.nextInt(); // Quantity of the item
            calculatedSum += (long) a * b; // Add the product to the total sum
        }

        // Compare the calculated sum with the total amount on the receipt
        if (calculatedSum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close(); // Close the scanner
    }
}