import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if (n == 0) {
            sc.close();
            return;
        }

        int firstDifficulty = sc.nextInt();
        int minDifficulty = firstDifficulty;
        int maxDifficulty = firstDifficulty;

        for (int i = 1; i < n; i++) {
            int currentDifficulty = sc.nextInt();
            if (currentDifficulty < minDifficulty) {
                minDifficulty = currentDifficulty;
            }
            if (currentDifficulty > maxDifficulty) {
                maxDifficulty = currentDifficulty;
            }
        }

        if (firstDifficulty == minDifficulty) {
            System.out.println("ez");
        } else if (firstDifficulty == maxDifficulty) {
            System.out.println("hard");
        } else {
            System.out.println("?");
        }

        sc.close();
    }
}