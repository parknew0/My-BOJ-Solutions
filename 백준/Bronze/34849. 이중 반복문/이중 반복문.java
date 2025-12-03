import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1초 = 1억(100,000,000)번 연산
        // N^2 <= 1억 이려면, N <= 10,000 이어야 함
        if (n <= 10000) {
            System.out.println("Accepted");
        } else {
            System.out.println("Time limit exceeded");
        }
        
        sc.close();
    }
}