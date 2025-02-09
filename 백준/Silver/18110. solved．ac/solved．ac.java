
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int cutLine = (int) Math.round((double) n * 0.15);

        int sum = 0;
        for (int i = cutLine; i < n - cutLine; i++) {
            sum += arr[i];
        }
        System.out.println( (int) Math.round((double) sum / (n - 2 * cutLine)));
    }

}
