import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // D: 처음 도넛 개수
        int donuts = sc.nextInt();
        // E: 이벤트 횟수
        int E = sc.nextInt();

        // 이벤트 횟수만큼 반복
        for (int i = 0; i < E; i++) {
            // 연산자 (+ 또는 -)
            String operator = sc.next();
            // 수량
            int quantity = sc.nextInt();

            // 연산자에 따라 도넛 개수 변경
            if (operator.equals("+")) {
                donuts += quantity;
            } else {
                donuts -= quantity;
            }
        }

        // 최종 도넛 개수 출력
        System.out.println(donuts);

        sc.close();
    }
}