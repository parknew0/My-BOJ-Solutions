import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] p = new int[4];
        for (int i = 0; i < 4; i++) {
            p[i] = sc.nextInt();  // 사람 위치
        }

        int x = sc.nextInt();     // 사과 중심 x
        sc.nextInt();             // y는 실제 충돌 판단에 쓰이지 않음
        sc.nextInt();             // r도 쓰이지 않음

        // 오로지 x == pi 일 때만 충돌
        for (int i = 0; i < 4; i++) {
            if (p[i] == x) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}
