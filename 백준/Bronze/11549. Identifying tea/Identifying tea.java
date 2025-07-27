import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int correctCount = 0;
        for (int i = 0; i < 5; i++) {
            int A = sc.nextInt();
            if (A == T) {
                correctCount++;
            }
        }
        System.out.println(correctCount);
        sc.close();
    }
}