import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3명의 직원에 대한 정보를 처리하기 위해 3번 반복합니다.
        for (int i = 0; i < 3; i++) {
            // 출근 시간 (h1, m1, s1)과 퇴근 시간 (h2, m2, s2)을 입력받습니다.
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();

            // 출근 시간과 퇴근 시간을 각각 초 단위로 변환합니다.
            int startTimeInSeconds = h1 * 3600 + m1 * 60 + s1;
            int endTimeInSeconds = h2 * 3600 + m2 * 60 + s2;

            // 총 근무 시간을 초 단위로 계산합니다.
            int durationInSeconds = endTimeInSeconds - startTimeInSeconds;

            // 근무 시간을 시, 분, 초로 변환합니다.
            int workH = durationInSeconds / 3600;
            int workM = (durationInSeconds % 3600) / 60;
            int workS = durationInSeconds % 60;

            // 계산된 근무 시간을 출력합니다.
            System.out.println(workH + " " + workM + " " + workS);
        }

        sc.close();
    }
}