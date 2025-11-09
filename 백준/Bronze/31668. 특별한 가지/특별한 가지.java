import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        // 학교가 만든 파묻튀밥의 줄 수 = (총 사용한 파묻튀 양) / (한 줄당 파묻튀 양)
        int numRolls = M / N;
        
        // 필요한 총 가지의 양 = (파묻튀밥 줄 수) * (한 줄당 필요한 가지 양)
        int totalEggplant = numRolls * K;
        
        System.out.println(totalEggplant);
        
        sc.close();
    }
}