import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 N을 받습니다 (사실 로직에는 필요 없으나 입력 스트림 처리를 위해 작성)
        sc.next(); 
        
        // 10억은 소수가 아니며(합성수), 문제의 최대 범위인 10억 이하의 수 중에서
        // 입력받는 어떤 N보다도 항상 크거나 같습니다.
        System.out.println(1000000000);
    }
}