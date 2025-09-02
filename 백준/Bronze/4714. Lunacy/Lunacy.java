import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 지구에서의 몸무게를 입력받습니다.
            double earthWeight = sc.nextDouble();

            // 입력값이 음수이면 루프를 종료합니다.
            if (earthWeight < 0) {
                break;
            }

            // 달에서의 몸무게를 계산합니다 (지구의 0.167배).
            double moonWeight = earthWeight * 0.167;

            // 형식에 맞춰 출력합니다. printf를 사용하여 소수점 둘째 자리까지 표시합니다.
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", earthWeight, moonWeight);
        }

        sc.close();
    }
}