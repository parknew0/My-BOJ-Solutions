import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // x: 편도 이동 시간
        // y: 버스가 제2공학관에 도착하기까지 남은 시간
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 민준이가 기다려야 하는 최소 시간
        int waitTime;

        if (y > x) {
            // Case 1: y > x
            // 버스가 제2공학관에 y분 후에 도착한다는 것은,
            // (y - x)분 전에 제2공학관에서 출발했다는 의미입니다.
            // (y - x)분 전에 제2공학관에서 출발했다는 것은,
            // (y - x)분 전에 서울대입구역에 도착했었다는 의미입니다.
            // 즉, 버스는 현재 제2공학관에서 서울대입구역으로 이동 중이며,
            // (y - x)분 후에 서울대입구역에 도착할 예정입니다.
            // (y - x)분 후에 버스가 서울대입구역에 도착하고, 
            // 다시 x분 후에 (즉, y분 후에) 제2공학관에 도착하게 됩니다.
            // 따라서 민준이는 (y - x)분만 기다리면 됩니다.
            waitTime = y - x;
        } else {
            // Case 2: y < x
            // 버스가 제2공학관에 y분 후에 도착한다는 것은,
            // (x - y)분 전에 서울대입구역에서 출발했다는 의미입니다.
            // 즉, 버스는 현재 서울대입구역에서 제2공학관으로 이동 중입니다.
            // 민준이는 이 버스를 놓쳤습니다.
            // 민준이는 버스가 제2공학관에 도착하고 (y분 소요)
            // 다시 서울대입구역으로 돌아올 때까지 (x분 소요)
            // 기다려야 합니다.
            // 따라서 민준이는 (y + x)분을 기다려야 합니다.
            waitTime = y + x;
        }

        System.out.println(waitTime);

        sc.close();
    }
}