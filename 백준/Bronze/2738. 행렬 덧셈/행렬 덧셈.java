import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 행렬의 크기 N, M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 결과를 저장할 2차원 배열 선언
        int[][] result = new int[N][M];

        // 첫 번째 행렬(A)을 입력받아 result 배열에 저장
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = sc.nextInt();
            }
        }

        // 두 번째 행렬(B)을 입력받으면서 바로 result 배열의 값에 더함
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] += sc.nextInt();
            }
        }

        // 최종 결과 행렬 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);

        sc.close();
    }
}