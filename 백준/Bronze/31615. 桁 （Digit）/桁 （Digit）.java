import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;

        // 정수를 문자열로 바꾸고 길이를 재면 자릿수를 쉽게 구할 수 있음
        int digitCount = String.valueOf(sum).length();

        System.out.println(digitCount);
    }
}
