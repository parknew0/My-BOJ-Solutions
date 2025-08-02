import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 사탕 종류의 수
            int K = sc.nextInt(); // 아이들이 행복해하는 최소 사탕 개수
            int totalKids = 0;

            for (int i = 0; i < N; i++) {
                int candyCount = sc.nextInt(); // 각 종류의 사탕 개수
                totalKids += (candyCount / K); // 해당 종류의 사탕으로 행복하게 할 수 있는 아이들의 수
            }
            System.out.println(totalKids);
        }
        sc.close();
    }
}