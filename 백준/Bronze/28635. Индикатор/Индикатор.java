import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  // 표시 가능한 최대 값
        int a = sc.nextInt();  // 현재 값
        int b = sc.nextInt();  // 목표 값

        int result = (b - a + m) % m;
        System.out.println(result);
    }
}
