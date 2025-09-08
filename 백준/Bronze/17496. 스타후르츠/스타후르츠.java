import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 여름의 일 수 (Duration of summer)
        // T: 스타후르츠가 자라는데 걸리는 일 수 (Growth time)
        // C: 심을 수 있는 칸의 수 (Number of plots)
        // P: 스타후르츠 개당 가격 (Price per fruit)
        int N = sc.nextInt();
        int T = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();

        sc.close();

        // 여름은 1일부터 N일까지입니다.
        // 첫 수확을 위해서는 최소 1일에 심어야 하고, 수확은 1+T일에 가능합니다.
        // 수확은 N일 또는 그 이전에 이루어져야 합니다.
        // 따라서 씨앗을 심고 수확하는 전체 주기는 1일부터 N일까지만 유효합니다.
        // 1일에 심기 시작하므로, 총 성장 가능한 일수는 (N-1)일 입니다.
        // (예: N=7이면, 1,2,3,4,5,6일 동안 성장이 가능)
        
        // 한 칸에서 수확할 수 있는 횟수를 계산합니다.
        // 이는 (N-1)일 동안 T일짜리 성장 주기가 몇 번 반복될 수 있는지와 같습니다.
        int harvestsPerPlot = (N - 1) / T;

        // 총 수익을 계산합니다.
        // (한 칸당 수확 횟수) * (칸의 수) * (개당 가격)
        int totalProfit = harvestsPerPlot * C * P;

        System.out.println(totalProfit);
    }
}