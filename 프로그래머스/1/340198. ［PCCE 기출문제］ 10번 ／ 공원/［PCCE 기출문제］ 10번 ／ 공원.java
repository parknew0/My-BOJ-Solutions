import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {

        Arrays.sort(mats);
        int row = park.length;
        int col = park[0].length;

        int result = -1;
        // 변의 길이가 큰 것부터 대입해본다.
        for (int sideIndex = mats.length - 1; sideIndex >= 0; sideIndex--) {
            int side = mats[sideIndex];
            // 정사각형 검사할 시작 인덱스 지점
            for (int i = 0; i < row - side + 1 ; i++) {
                for (int j = 0; j < col - side + 1; j++) {
                    // 인덱스 지점으로부터 정사각형 검사 시작
                    boolean flag = false;
                    for (int k = i; k < i + side; k++) {
                        for (int l = j; l < j + side; l++) {
                            // -1이 아니면 정사각형 검사 종료 후 다음 인덱스 지점으로 이동
                            if(!park[k][l].equals("-1")) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) break;
                    }
                    if (!flag) {
                        return side;
                    }
                }
            }
        }

        return result;
    }
}