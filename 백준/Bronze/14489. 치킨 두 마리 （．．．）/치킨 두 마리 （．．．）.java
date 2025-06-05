import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int A = sc.nextInt(); // 첫 번째 통장 잔고
        int B = sc.nextInt(); // 두 번째 통장 잔고
        int C = sc.nextInt(); // 치킨 한 마리 가격

        int totalBalance = A + B;     // 전체 잔액
        int chickenCost = 2 * C;      // 치킨 두 마리 가격

        // 살 수 있는지 확인
        if (totalBalance >= chickenCost) {
            System.out.println(totalBalance - chickenCost);
        } else {
            System.out.println(totalBalance);
        }

        sc.close();
    }
}
