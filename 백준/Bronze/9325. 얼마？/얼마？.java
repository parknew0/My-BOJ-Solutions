import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 읽기
        int T = sc.nextInt();

        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            // 자동차의 기본 가격 읽기
            int s = sc.nextInt();
            // 옵션의 개수 읽기
            int n = sc.nextInt();

            // 총 옵션 가격 계산
            long totalOptionPrice = 0; // 옵션 가격이 커질 수 있으므로 long 사용
            for (int j = 0; j < n; j++) {
                int q = sc.nextInt(); // 옵션의 개수
                int p = sc.nextInt(); // 옵션의 가격
                totalOptionPrice += (long) q * p; // 옵션 개수 * 옵션 가격
            }

            // 최종 자동차 가격 출력
            System.out.println(s + totalOptionPrice);
        }

        sc.close();
    }
}