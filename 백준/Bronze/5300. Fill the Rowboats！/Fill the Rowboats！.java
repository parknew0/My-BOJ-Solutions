import java.util.Scanner;

/**
 * Baekjoon Online Judge problem #5300 - Fill the Rowboats!
 */
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Read the total number of pirates.
        int n = scanner.nextInt();
        
        // Close the scanner as we don't need it anymore.
        scanner.close();

        // Loop through each pirate from 1 to N.
        for (int i = 1; i <= n; i++) {
            // Print the pirate's number.
            System.out.print(i);

            // A group is full every 6 pirates, or when the last pirate is reached.
            // Check if it's the 6th pirate in a group OR the very last pirate.
            if (i % 6 == 0 || i == n) {
                // If so, print " Go!".
                System.out.print(" Go!");
                
                // If this is a "Go!" moment but not the absolute end,
                // we need a space to separate it from the next pirate's number.
                if (i != n) {
                    System.out.print(" ");
                }
            } else {
                // If it's not time for "Go!", just print a space to separate the numbers.
                System.out.print(" ");
            }
        }
    }
}