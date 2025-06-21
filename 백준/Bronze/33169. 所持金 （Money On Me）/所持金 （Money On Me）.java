import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 1,000엔짜리 지폐 개수
        int b = sc.nextInt(); // 10,000엔짜리 지폐 개수
        System.out.println(a * 1000 + b * 10000);
    }
}
