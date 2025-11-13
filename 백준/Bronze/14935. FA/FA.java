import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 함수 F(x)의 결과는 (첫 자리 수) * (길이) 입니다.
        // 입력 x의 최대 길이는 101 (10^100) 입니다.
        // 첫 자리 수는 최대 9입니다.
        // 따라서 F(x)의 첫 번째 결과(x1)는 9 * 101 = 909 를 넘을 수 없습니다.
        
        // F(x1)의 결과(x2)는 909 이하의 수에 F를 적용한 것입니다.
        // 최대값은 F(909) = 9 * 3 = 27 입니다.
        
        // F(x2)의 결과(x3)는 27 이하의 수에 F를 적용한 것입니다.
        // F(10~19) -> 1 * 2 = 2
        // F(20~27) -> 2 * 2 = 4
        // F(0~9) -> (0~9) * 1 = 0~9
        // 따라서 x3는 0~9 사이의 한 자리 수가 됩니다.
        
        // F(x3)의 결과(x4)는 한 자리 수에 F를 적용한 것입니다.
        // F(n) = n * 1 = n
        // 따라서 x4 = x3 입니다.
        
        // 모든 수는 최대 4번의 F 함수 적용만으로
        // x3 -> x3
        // 와 같이 동일한 수가 반복되는 지점(고정점)에 도달하게 됩니다.
        // 문제의 정의에 따라, 모든 수는 FA 수입니다.
        
        // 입력을 받을 필요조차 없습니다.
        System.out.println("FA");
    }
}