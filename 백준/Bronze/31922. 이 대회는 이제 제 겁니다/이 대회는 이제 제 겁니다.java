import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Division 1 상금 A, Division 2 상금 P, shake! 상금 C 입력
        int A = sc.nextInt();
        int P = sc.nextInt();
        int C = sc.nextInt();
        
        // Division 1 참가 시 얻는 총 상금 (A + C)
        int prizeOption1 = A + C;
        
        // Division 2 참가 시 얻는 총 상금 (P)
        int prizeOption2 = P;
        
        // 두 가지 선택지 중 더 큰 값을 출력
        System.out.println(Math.max(prizeOption1, prizeOption2));
        
        sc.close();
    }
}