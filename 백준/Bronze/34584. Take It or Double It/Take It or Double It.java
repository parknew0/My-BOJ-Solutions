import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        long x = scanner.nextLong();
        long d = scanner.nextLong();
        
        // 돈을 두 배로 늘렸을 때 예산을 초과하는지 확인
        if (x * 2 > d) {
            // 예산을 초과하면 돈을 받아야 함
            System.out.println("take it");
        } else {
            // 예산을 초과하지 않으면 다음 사람에게 기회를 넘김
            System.out.println("double it");
        }
        
        scanner.close();
    }
}