
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int len = charArray.length;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        if (isImpossible(list)) return;

        List<Map.Entry<Character, Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort(Map.Entry.comparingByKey());
        printPalindrome(mapList);

    }

    public static void printPalindrome(List<Map.Entry<Character, Integer>> mapList)
    {    // 홀수 등장 문자의 개수를 세기 위한 변수
        int oddCount = 0;
        char oddChar = ' ';
        for (Map.Entry<Character, Integer> entry : mapList) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }

        StringBuilder sb = new StringBuilder();

            for (Map.Entry<Character, Integer> entry : mapList) {
                for (int i = 0 ; i < entry.getValue() / 2 ; i++) {
                    sb.append(entry.getKey());
                }
            }
            StringBuilder temp = new StringBuilder(sb);
            if(oddCount % 2 != 0) sb.append(oddChar);
            sb.append(temp.reverse());
            System.out.println(sb.toString());
            return;
    }

    public static boolean isImpossible (List<Integer> list) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                count++;
                if (count > 1) {
                    System.out.println("I'm Sorry Hansoo");
                    return true;
                }
            }
        }
        return false;
    }

}
