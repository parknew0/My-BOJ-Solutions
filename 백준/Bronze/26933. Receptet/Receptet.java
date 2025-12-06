import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalCost = 0;

        for (int i = 0; i < N; i++) {
            int H = sc.nextInt(); // 현재 가진 양
            int B = sc.nextInt(); // 필요한 양
            int K = sc.nextInt(); // 가격

            if (B > H) {
                totalCost += (B - H) * K;
            }
        }
        
        System.out.println(totalCost);
        sc.close();
    }
}