import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A, B, C사 단가
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        // 구매량 (g)
        int U = sc.nextInt();
        int V = sc.nextInt();
        int W = sc.nextInt();

        // 총 금액 계산
        // A사: 100g 단위, B사: 50g 단위, C사: 20g 단위
        int total = (U / 100 * X) + (V / 50 * Y) + (W / 20 * Z);

        System.out.println(total);
        
        sc.close();
    }
}