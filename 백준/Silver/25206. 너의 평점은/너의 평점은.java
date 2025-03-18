
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       Map<String, Double> grades = new HashMap<>();
       grades.put("A+", 4.5);
       grades.put("A0", 4.0);
       grades.put("B+", 3.5);
       grades.put("B0", 3.0);
       grades.put("C+", 2.5);
       grades.put("C0", 2.0);
       grades.put("D+", 1.5);
       grades.put("D0", 1.0);
       grades.put("F", 0.0);

        double lectureTimeSum = 0;
        double sum = 0;
        for (int i = 0 ; i < 20 ; i++) {
           String[] tokens = br.readLine().split(" ");

           if (!tokens[2].equals("P")) {
               double score = grades.get(tokens[2]);
               double lectureTime = Double.parseDouble(tokens[1]);

               sum += score * lectureTime;
               lectureTimeSum += lectureTime;
           }
       }

        double result = sum / lectureTimeSum;
        result = Math.round(result * 1000000);
        result = result / 1000000;

        System.out.print(result);

    }
}