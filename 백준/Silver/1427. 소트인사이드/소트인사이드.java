
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] nums = new int[input.length()];
        for (int i = 0 ; i < input.length() ; i++) {
            nums[i] = input.charAt(i) - '0';
        }

        Arrays.sort(nums);

        for (int i = 0 ; i < input.length() / 2 ; i++) {
            int temp = nums[input.length() - 1 - i];
            nums[input.length() - 1 - i] = nums[i];
            nums[i] = temp;
        }


        for (int i = 0 ; i < input.length() ; i++) {
            System.out.print(nums[i]);
        }
    }
}