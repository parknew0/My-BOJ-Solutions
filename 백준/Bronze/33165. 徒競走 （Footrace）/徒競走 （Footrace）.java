import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 시간 (초)
        int V = sc.nextInt();  // 속도 (m/s)

        System.out.println(T * V);  // 거리 출력
    }
}
