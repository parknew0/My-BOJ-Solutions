import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        // X자리 레퓨닛 생성
        StringBuilder repunitXBuilder = new StringBuilder();
        for (int i = 0; i < X; i++) {
            repunitXBuilder.append("1");
        }
        BigInteger repunitX = new BigInteger(repunitXBuilder.toString());

        // Y자리 레퓨닛 생성
        StringBuilder repunitYBuilder = new StringBuilder();
        for (int i = 0; i < Y; i++) {
            repunitYBuilder.append("1");
        }
        BigInteger repunitY = new BigInteger(repunitYBuilder.toString());

        // 두 레퓨닛의 합 계산 및 출력
        BigInteger sum = repunitX.add(repunitY);
        System.out.println(sum);
    }
}