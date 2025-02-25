import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 라면을 끓이는 횟수 입력

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();  // 라면 계수
            int B = sc.nextInt();  // 기본 물의 양
            int X = sc.nextInt();  // 끓일 라면 수

            int W = A * (X - 1) + B;  // 공식 적용
            System.out.println(W);  // 결과 출력
        }

        sc.close();  // Scanner 닫기 (선택 사항)
    }
}
