import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble(); // 테이블의 지름
        double w = sc.nextDouble(); // 각 기사에게 필요한 너비
        int n = sc.nextInt();     // 기사의 수

        double pi = 3.14159;

        // 테이블의 둘레 계산 (지름 * 원주율)
        double tableCircumference = d * pi;

        // 모든 기사에게 필요한 총 둘레 계산
        double requiredCircumference = n * w;

        // 테이블의 둘레가 필요한 둘레보다 크거나 같으면 "YES", 아니면 "NO" 출력
        if (tableCircumference >= requiredCircumference) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}