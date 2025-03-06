
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int[] nums = new int[3];

        for (int i = 0 ; i < 3 ; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(nums);

        System.out.print(nums[1]);
    }
}