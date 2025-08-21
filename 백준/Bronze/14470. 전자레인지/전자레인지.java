import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.close();

        int time = 0;

        if (a < 0) {
            // 얼어있는 고기를 0도까지 데우는 시간
            time += Math.abs(a) * c;
            // 해동 시간
            time += d;
            // 0도에서 목표 온도까지 데우는 시간
            time += b * e;
        } else if (a == 0) {
            // 0도에서 시작하므로 해동 시간 필요
            time += d;
            // 0도에서 목표 온도까지 데우는 시간
            time += b * e;
        } else { // a > 0
            // 얼어있지 않은 고기를 목표 온도까지 데우는 시간
            time += (b - a) * e;
        }

        System.out.println(time);
    }
}