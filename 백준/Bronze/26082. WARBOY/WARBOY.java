import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);

        // 경쟁사 제품의 가격(A), 성능(B), WARBOY의 가격(C)을 입력받습니다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 문제의 조건에 따라 WARBOY의 성능을 계산합니다.
        // 1. 경쟁사 제품의 가격 대비 성능을 계산합니다: (B / A)
        // 2. WARBOY의 가격 대비 성능은 경쟁사 제품의 3배입니다: 3 * (B / A)
        // 3. WARBOY의 성능은 (WARBOY의 가격 대비 성능) * (WARBOY의 가격) 입니다: (3 * (B / A)) * C
        int warboyPerformance = (b / a) * 3 * c;

        // 계산된 WARBOY의 성능을 출력합니다.
        System.out.println(warboyPerformance);

        // Scanner 객체를 닫아줍니다.
        sc.close();
    }
}