import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 사람 수
        int maxPrize = 0; // 가장 큰 상금 저장 변수

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 첫 번째 주사위
            int b = sc.nextInt(); // 두 번째 주사위
            int c = sc.nextInt(); // 세 번째 주사위
            int prize = 0;

            if (a == b && b == c) {
                // 세 눈이 모두 같음
                prize = 10000 + a * 1000;
            } else if (a == b || a == c) {
                // a가 두 번 나옴
                prize = 1000 + a * 100;
            } else if (b == c) {
                // b가 두 번 나옴
                prize = 1000 + b * 100;
            } else {
                // 모두 다름 → 가장 큰 값 * 100
                int max = Math.max(a, Math.max(b, c));
                prize = max * 100;
            }

            // 현재 사람의 상금이 지금까지의 최고 상금보다 크면 갱신
            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }

        System.out.println(maxPrize);
    }
}
