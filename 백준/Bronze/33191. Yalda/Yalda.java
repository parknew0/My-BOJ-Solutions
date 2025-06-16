import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = sc.nextInt();
        int watermelon = sc.nextInt();
        int pomegranates = sc.nextInt();
        int nuts = sc.nextInt();

        if (budget >= watermelon) {
            System.out.println("Watermelon");
        } else if (budget >= pomegranates) {
            System.out.println("Pomegranates");
        } else if (budget >= nuts) {
            System.out.println("Nuts");
        } else {
            System.out.println("Nothing");
        }
    }
}
