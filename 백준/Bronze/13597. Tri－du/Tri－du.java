import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 첫 번째 카드
        int b = sc.nextInt(); // 두 번째 카드

        int result = Math.max(a, b); // 둘 중 큰 수를 세 번째 카드로 가정
        System.out.println(result);
    }
}
