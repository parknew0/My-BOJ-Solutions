
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("0")) {
                input = "0";
            } else {
                input = input.replaceFirst("^0+", "");
            }
            if (input.isEmpty()) {
                input = "0";
            }
            list.add(input);
        }
        int k = Integer.parseInt(br.readLine());

        // 어떤 알파벳 k개를 'Z'로 변환했을 때 누적합 구하기
        List<BigInteger> gain = new ArrayList<>();
        for (int i = 0; i < 36; i++) {
            gain.add(BigInteger.ZERO);
        }
        getGain(list, gain);

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < 36; i++) {
            indices.add(i);
        }
        indices.sort((a, b) -> gain.get(b).compareTo(gain.get(a)));

        BigInteger additionalGain = BigInteger.ZERO;
        for (int i = 0; i < k; i++) {
            additionalGain = additionalGain.add(gain.get(indices.get(i)));
        }


        BigInteger originalSum = BigSum(list);
        originalSum = originalSum.add(additionalGain);
        String ans = decimalToBase32(originalSum);

        bw.write(ans);
        bw.flush();
        bw.close();
    }

    static public void getGain (List<String> list, List<BigInteger> gain)
    {
        for (String s : list) {
            int len = s.length();

            for (int i = 0; i < len; i++) {
                int pos = len - i - 1;
                char c = s.charAt(pos);

                BigInteger charValue = BigInteger.valueOf(35 - charToInt(c));
                BigInteger charGainSum = (BigInteger.valueOf(36).pow(i)).multiply(charValue);

                gain.set(charToInt(c), gain.get(charToInt(c)).add(charGainSum));
            }
        }


    }

    static public int charToInt(char c)
    {
        int charInt;
        if (c >= '0' && c <= '9') {
            charInt = c - '0';
        }
        else charInt = c - 'A' + 10;

        return charInt;
    }

    static public BigInteger BigSum (List<String> list) {
        
        BigInteger sum = BigInteger.ZERO;

        for (String s : list) {
            int size = s.length();
            int index = 0;

            for (int i = size - 1; i >= 0; i--) {
                char curr = s.charAt(index);
                int currInt;
                if (curr >= '0' && curr <= '9') {
                    currInt = curr - '0';
                }
                else currInt = curr - 'A' + 10;
                BigInteger digit = BigInteger.valueOf(36).pow(i).multiply(BigInteger.valueOf(currInt));
                sum = sum.add(digit);
                index++;
            }
        }
        return sum;
    }

    static public String decimalToBase32 (BigInteger sum) {
        if(sum.equals(BigInteger.ZERO)) {  // sum이 0이면 "0"을 바로 반환
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        while (sum.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = sum.mod(BigInteger.valueOf(36));
            int remainderInt = remainder.intValue();
            if (remainderInt >= 0 && remainderInt < 10) {
                sb.insert(0, remainderInt);
            }
            else {
                char remainderChar = (char) (remainderInt + 'A' - 10);
                sb.insert(0, remainderChar);
            }

            sum = sum.divide(BigInteger.valueOf(36));

        }
        return sb.toString();
    }

}
