import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각 입력
        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 초

        // 요리 시간 (초 단위)
        int D = sc.nextInt();

        // 현재 시간을 모두 초로 변환
        int totalSeconds = A * 3600 + B * 60 + C + D;

        // 시, 분, 초로 다시 나눔
        int hour = (totalSeconds / 3600) % 24;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;

        System.out.println(hour + " " + minute + " " + second);
    }
}
