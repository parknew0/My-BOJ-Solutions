
import java.io.*;
import java.util.*;

class CoorComparator implements Comparator<int []> {
    @Override
    public int compare(int[] a1, int[] a2)
    {
        if (a1[1] != a2[1]) return Integer.compare(a1[1], a2[1]);
        else return Integer.compare(a1[0], a2[0]);
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[][] coordinates = new int[n][2];

      for (int i = 0 ; i < n ; i++) {
          String[] tokens = br.readLine().split(" ");
        for (int j = 0 ; j < 2 ; j++) {
            coordinates[i][j] = Integer.parseInt(tokens[j]);
        }
      }

      Arrays.sort(coordinates, new CoorComparator());

      for (int[] row : coordinates) {
          bw.write(row[0] + " " + row[1] + "\n");
      }

      bw.flush();
      br.close();
      bw.close();
    }
}