
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int remainder = 1000 - Integer.parseInt(br.readLine());

        int quotient = remainder / 500;
        int rem = remainder % 500;
        remainder = rem;
        sum += quotient;

        quotient = remainder / 100;
        rem = remainder % 100;
        remainder = rem;
        sum += quotient;

        quotient = remainder / 50;
        rem = remainder % 50;
        remainder = rem;
        sum += quotient;

        quotient = remainder / 10;
        rem = remainder % 10;
        remainder = rem;
        sum += quotient;

        quotient = remainder / 5;
        rem = remainder % 5;
        sum += quotient;
        sum += rem;

        System.out.print(sum);

    }

}