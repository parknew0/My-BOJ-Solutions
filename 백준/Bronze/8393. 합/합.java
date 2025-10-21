import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위해 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에서 정수 n을 입력받습니다. (1 ≤ n ≤ 10,000)
        int n = sc.nextInt();

        // Scanner 객체를 닫아 리소스 누수를 방지합니다.
        sc.close();

        // 1부터 n까지의 합을 저장할 변수를 초기화합니다.
        int sum = 0;

        // for 반복문을 사용하여 1부터 n까지의 각 숫자를 sum에 더합니다.
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // 최종 합계를 출력합니다.
        System.out.println(sum);
    }
}
