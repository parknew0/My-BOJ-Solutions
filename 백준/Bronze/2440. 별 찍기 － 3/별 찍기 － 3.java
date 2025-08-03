import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫째 줄에 N을 입력받습니다.

        // N부터 1까지 감소하며 각 줄에 별을 출력합니다.
        for (int i = N; i >= 1; i--) {
            // 현재 줄에 i개의 별을 출력합니다.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 다음 줄로 넘어갑니다.
        }

        sc.close(); // Scanner를 닫습니다.
    }
}