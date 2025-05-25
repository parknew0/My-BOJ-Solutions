import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt(); // 부가가치세 포함 가격
        int A = B * 10 / 11;  // 원래 가격 계산
        System.out.println(A);
    }
}
