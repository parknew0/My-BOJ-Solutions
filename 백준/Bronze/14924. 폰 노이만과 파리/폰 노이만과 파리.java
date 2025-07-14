import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int D = sc.nextInt();
        
        // 두 기차가 만나는 데 걸리는 시간 = 거리 / (두 기차의 속도의 합)
        int timeToCollision = D / (2 * S);
        
        // 파리가 이동한 거리 = 파리의 속도 * 시간
        int flyDistance = T * timeToCollision;
        
        System.out.println(flyDistance);
        
        sc.close();
    }
}