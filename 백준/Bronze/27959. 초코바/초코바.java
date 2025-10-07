import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100원 동전의 개수 N과 초코바의 가격 M을 입력받습니다.
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 밤고가 가진 총 금액을 계산합니다. (100원 * N개)
        int totalMoney = N * 100;

        // 가진 돈이 초코바 가격보다 크거나 같은지 확인합니다.
        if (totalMoney >= M) {
            // 살 수 있으면 "Yes"를 출력합니다.
            System.out.println("Yes");
        } else {
            // 살 수 없으면 "No"를 출력합니다.
            System.out.println("No");
        }

        sc.close();
    }
}