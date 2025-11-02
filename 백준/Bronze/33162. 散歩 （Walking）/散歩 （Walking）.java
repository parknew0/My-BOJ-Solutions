import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        // 행동 A (+3)의 횟수는 (X + 1) / 2 입니다.
        int countA = (X + 1) / 2;
        
        // 행동 B (-2)의 횟수는 X / 2 입니다.
        int countB = X / 2;
        
        // 총 이동 거리 계산
        int position = (countA * 3) - (countB * 2);
        
        System.out.println(position);
        
        sc.close();
    }
}