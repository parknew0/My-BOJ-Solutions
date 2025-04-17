import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String from = sc.next(); // 예: "a1"
        String to = sc.next();   // 예: "b3"

        // 좌표 변환
        int x1 = from.charAt(0) - 'a';
        int y1 = from.charAt(1) - '1';
        int x2 = to.charAt(0) - 'a';
        int y2 = to.charAt(1) - '1';

        // 차이 계산
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        // 항상 x <= y 되도록 정렬
        int x = Math.min(dx, dy);
        int y = Math.max(dx, dy);

        System.out.println(x + " " + y);
    }
}
