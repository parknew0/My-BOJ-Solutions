import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        double S = sc.nextDouble(); // 속도 (마일/시간)
        double D = sc.nextDouble(); // 거리 (피트)
        double T = sc.nextDouble(); // 시간 (초)

        // 단위를 피트와 초로 통일하기
        // 1 마일 = 5280 피트
        // 1 시간 = 3600 초
        // S (마일/시간) -> S * 5280 / 3600 (피트/초)
        double speedInFeetPerSecond = S * 5280.0 / 3600.0;

        // 주어진 시간 T 동안 이동할 수 있는 거리 계산
        double distanceCanTravel = speedInFeetPerSecond * T;

        // 이동 가능한 거리가 교차로 끝까지의 거리보다 크거나 같은지 확인
        if (distanceCanTravel >= D) {
            System.out.println("MADE IT");
        } else {
            System.out.println("FAILED TEST");
        }

        sc.close();
    }
}