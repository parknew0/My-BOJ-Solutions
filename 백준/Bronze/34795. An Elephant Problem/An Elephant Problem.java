import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 땅콩 한 개의 무게
        int d = sc.nextInt(); // 부스러기 총 무게
        
        // (d / m)의 올림 처리를 위한 계산
        // 부스러기 무게를 커버하기 위한 최소한의 땅콩 개수
        System.out.println((d + m - 1) / m);
    }
}