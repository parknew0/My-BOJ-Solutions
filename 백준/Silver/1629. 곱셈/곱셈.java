
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        BigInteger a = new BigInteger(tokens[0]);
        BigInteger b = new BigInteger(tokens[1]);
        BigInteger c = new BigInteger(tokens[2]);

        BigInteger result = a.modPow(b,c);

        System.out.print(result);

    }
}
