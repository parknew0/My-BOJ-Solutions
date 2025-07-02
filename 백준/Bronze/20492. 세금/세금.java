import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 첫 번째 경우: 전체 상금의 22%를 제세공과금으로 납부
        int case1 = (int) (N * (1 - 0.22));

        // 두 번째 경우: 상금의 80%를 필요 경비로 인정, 나머지 20% 중 22%만 제세공과금으로 납부
        int case2 = (int) (N * (1 - 0.20 * 0.22));

        System.out.println(case1 + " " + case2);

        sc.close();
    }
}