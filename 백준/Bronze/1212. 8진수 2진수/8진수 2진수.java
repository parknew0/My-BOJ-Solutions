
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            int decimal = Integer.parseInt(Character.toString(ch), 8);
            String binary = Integer.toBinaryString(decimal);
            int temp = Integer.parseInt(binary);
            String Octa;
            if (i == 0) {
                Octa = String.format("%d",temp);
            }
            else Octa = String.format("%03d",temp);

            sb.append(Octa);
        }


        System.out.println(sb.toString());
    }

}
