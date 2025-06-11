import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 첫 번째 숫자
        int b = sc.nextInt(); // 두 번째 숫자
        int c = sc.nextInt(); // 세 번째 숫자

        // 가능한 숫자 조합들
        int[][] paths = {
            {1, 6, 2}, {1, 6, 5},
            {1, 8, 2}, {1, 8, 5},
            {3, 6, 2}, {3, 6, 5},
            {3, 8, 2}, {3, 8, 5}
        };

        boolean possible = false;
        for (int[] path : paths) {
            if (a == path[0] && b == path[1] && c == path[2]) {
                possible = true;
                break;
            }
        }

        System.out.println(possible ? "JAH" : "EI");
    }
}
