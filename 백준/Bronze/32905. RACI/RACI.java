import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 행 개수
        int m = sc.nextInt(); // 열 개수
        sc.nextLine(); // 개행 처리
        
        boolean isValid = true;
        
        for (int i = 0; i < n; i++) {
            String[] row = sc.nextLine().split(" ");
            int aCount = 0;
            for (String cell : row) {
                if (cell.equals("A")) {
                    aCount++;
                }
            }
            if (aCount != 1) {
                isValid = false;
                break; // 한 줄이라도 조건 어기면 즉시 종료
            }
        }
        
        System.out.println(isValid ? "Yes" : "No");
    }
}
