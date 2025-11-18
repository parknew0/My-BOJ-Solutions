import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int maxReversedValue = 0;
        
        for (int i = 1; i <= K; i++) {
            int product = N * i;
            int reversed = 0;
            
            // 숫자를 뒤집습니다.
            while (product > 0) {
                reversed = reversed * 10 + product % 10;
                product /= 10;
            }
            
            // 최댓값을 갱신합니다.
            if (reversed > maxReversedValue) {
                maxReversedValue = reversed;
            }
        }
        
        System.out.println(maxReversedValue);
        sc.close();
    }
}