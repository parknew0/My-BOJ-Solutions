
import java.io.*;
import java.util.*;

public class Main {
    public static List<Character> vowelsBundle = new ArrayList<>();
    public static List<Character> consonantBundle = new ArrayList<>();
    public static List<Character> vowels = new ArrayList<>();
    public static List<Character> consonants = new ArrayList<>();
    public static List<String> passwords = new ArrayList<>();
    public static int l;
    public static int c;

    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        l = Integer.parseInt(tokens[0]);
        c = Integer.parseInt(tokens[1]);
        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < c ; i++) {
            char c = tokens[i].charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsBundle.add(c);
            } else consonantBundle.add(c);
        }

        int minVowelsSize = Math.min(l - 2, vowelsBundle.size());
        // i는 최소 모음 선택 개수

        for (int i = 1; i <= minVowelsSize; i++) {
            vowelSelection(0, 0, i);
        }

        passwords.sort(String::compareTo);

        sb = new StringBuilder();
        for (String s : passwords) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }

    public static void vowelSelection (int start, int depth, int endDepth) {
        if (depth == endDepth) {
            consonantSelection(0, 0, l - endDepth);
            return;
        }

        for (int i = start ; i < vowelsBundle.size() ; i++) {
            vowels.add(vowelsBundle.get(i));
            vowelSelection(i + 1, depth + 1, endDepth);
            vowels.remove(vowelsBundle.get(i));
        }
    }

    public static void consonantSelection (int start, int depth, int endDepth) {
        if (depth == endDepth) {
            List<Character> combinedList = new ArrayList<>();
            combinedList.addAll(vowels);
            combinedList.addAll(consonants);
            printProbablePassword(combinedList);
            return;
        }

        for (int i = start; i < consonantBundle.size(); i++) {
            consonants.add(consonantBundle.get(i));
            consonantSelection(i + 1, depth + 1, endDepth);
            consonants.remove(consonantBundle.get(i));
        }
    }

    public static void printProbablePassword (List<Character> probableCharacters) {
        probableCharacters.sort(Character::compare);
        sb = new StringBuilder();
        for (char c : probableCharacters) {
            sb.append(c);
        }
        passwords.add(sb.toString());
    }

}