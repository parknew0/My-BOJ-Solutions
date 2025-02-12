
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);

        int[] coinUnit = new int[n];

        for (int i = 0; i < n; i++){
            coinUnit[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n - 1 ; i >= 0 ; i--){
            if (k / coinUnit[i] > 0){
                count += k / coinUnit[i];
                k %= coinUnit[i];
            }
        }
        System.out.println(count);
    }
}
