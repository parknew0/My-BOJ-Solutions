import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        dice[0] = sc.nextInt();
        dice[1] = sc.nextInt();
        dice[2] = sc.nextInt();
        sc.close();

        Arrays.sort(dice); // Sort the array to easily check for identical values

        int reward = 0;

        if (dice[0] == dice[1] && dice[1] == dice[2]) { // All three dice are the same
            reward = 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) { // Two dice are the same
            if (dice[0] == dice[1]) {
                reward = 1000 + dice[0] * 100;
            } else { // dice[1] == dice[2]
                reward = 1000 + dice[1] * 100;
            }
        } else { // All dice are different
            reward = dice[2] * 100; // dice[2] is the largest after sorting
        }

        System.out.println(reward);
    }
}