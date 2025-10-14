import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 네 개의 이동 시간을 초 단위로 입력받습니다.
        int time1 = sc.nextInt();
        int time2 = sc.nextInt();
        int time3 = sc.nextInt();
        int time4 = sc.nextInt();

        // 총 이동 시간을 초 단위로 계산합니다.
        int totalSeconds = time1 + time2 + time3 + time4;

        // 총 이동 시간을 분과 초로 변환합니다.
        int minutes = totalSeconds / 60; // 몫은 분이 됩니다.
        int seconds = totalSeconds % 60; // 나머지는 초가 됩니다.

        // 결과를 출력합니다.
        System.out.println(minutes);
        System.out.println(seconds);

        sc.close();
    }
}