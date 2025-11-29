import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); // 심사위원 수
        String votes = sc.next(); // 투표 결과 문자열

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < V; i++) {
            if (votes.charAt(i) == 'A') {
                countA++;
            } else {
                countB++;
            }
        }

        if (countA > countB) {
            System.out.println("A");
        } else if (countB > countA) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
        
        sc.close();
    }
}