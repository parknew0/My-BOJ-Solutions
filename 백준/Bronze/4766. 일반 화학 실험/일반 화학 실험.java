import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 온도를 읽어 이전 온도로 설정합니다.
        double prevTemp = sc.nextDouble();

        // 999가 입력될 때까지 무한 루프를 실행합니다.
        while (true) {
            // 현재 온도를 읽습니다.
            double currentTemp = sc.nextDouble();

            // 입력받은 값이 999이면 루프를 종료합니다.
            if (currentTemp == 999) {
                break;
            }

            // 현재 온도와 이전 온도의 차이를 계산하고 소수점 둘째 자리까지 출력합니다.
            double diff = currentTemp - prevTemp;
            System.out.printf("%.2f\n", diff);

            // 다음 계산을 위해 현재 온도를 이전 온도로 업데이트합니다.
            prevTemp = currentTemp;
        }

        sc.close();
    }
}