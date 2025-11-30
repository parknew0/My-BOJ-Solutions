import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 0~10분위 장학금 금액 입력
        int[] m = new int[11];
        for (int i = 0; i < 11; i++) {
            m[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int bracket = sc.nextInt(); // 분위
            double gpa = sc.nextDouble(); // 평점
            int credits = sc.nextInt(); // 취득 학점

            // 조건: 17학점 이상 && 평점 2.0 이상
            if (credits >= 17 && gpa >= 2.0) {
                total += m[bracket];
            }
        }

        System.out.println(total);
    }
}