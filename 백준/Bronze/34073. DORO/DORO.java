import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String line = scanner.nextLine();
        
        String[] words = line.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + "DORO");
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}