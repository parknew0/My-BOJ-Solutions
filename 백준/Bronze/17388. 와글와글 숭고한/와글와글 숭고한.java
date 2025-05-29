import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt(); // 숭실대학교 참여도
        int K = sc.nextInt(); // 고려대학교 참여도
        int H = sc.nextInt(); // 한양대학교 참여도

        int sum = S + K + H;

        if (sum >= 100) {
            System.out.println("OK");
        } else {
            // 가장 참여도가 낮은 대학의 이름 출력
            if (S < K && S < H) {
                System.out.println("Soongsil");
            } else if (K < S && K < H) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
