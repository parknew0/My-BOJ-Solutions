import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long s = sc.nextLong();

        // N% 할인을 적용했을 때의 가격
        long price1 = (m + 1) * s * (100 - n) / 100;

        // M+1 할인을 적용했을 때의 가격
        long price2 = m * s;

        // 두 가격 중 더 낮은 가격을 출력
        System.out.println(Math.min(price1, price2));

        sc.close();
    }
}