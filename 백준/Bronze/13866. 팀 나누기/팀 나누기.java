import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skill = new int[4];
        for (int i = 0; i < 4; i++) {
            skill[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        // 6가지 팀 나누기 경우 확인
        minDiff = Math.min(minDiff, Math.abs((skill[0] + skill[1]) - (skill[2] + skill[3])));
        minDiff = Math.min(minDiff, Math.abs((skill[0] + skill[2]) - (skill[1] + skill[3])));
        minDiff = Math.min(minDiff, Math.abs((skill[0] + skill[3]) - (skill[1] + skill[2])));

        System.out.println(minDiff);
    }
}
