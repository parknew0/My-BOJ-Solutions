import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        int countH = 0;
        int countI = 0;
        int countA = 0;
        int countR = 0;
        int countC = 0;
        
        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);
            switch (ch) {
                case 'H':
                    countH++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'A':
                    countA++;
                    break;
                case 'R':
                    countR++;
                    break;
                case 'C':
                    countC++;
                    break;
            }
        }
        
        int minCount = Math.min(countH, countI);
        minCount = Math.min(minCount, countA);
        minCount = Math.min(minCount, countR);
        minCount = Math.min(minCount, countC);
        
        System.out.println(minCount);
    }
}