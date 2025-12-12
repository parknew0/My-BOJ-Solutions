import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 세로 (m)
        int W = sc.nextInt(); // 가로 (m)

        // 더 짧은 변을 기준으로 반지름 계산 (m -> cm 변환 포함)
        // 지름(m) * 100 / 2 = 반지름(cm)
        System.out.println(Math.min(H, W) * 50);

        sc.close();
    }
}