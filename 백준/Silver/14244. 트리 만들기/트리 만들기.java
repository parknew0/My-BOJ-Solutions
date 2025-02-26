
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]); // 노드 개수
        int m = Integer.parseInt(tokens[1]); // 리프 개수

        int edgeCount =  n - 1;
        int leafCount = m - 2;
        int toNextBranch = 1;
        int[] curEdge = new int[]{0,1};
        edgeCount--;

        while (edgeCount > 0) {
            System.out.println(curEdge[0] + " " + curEdge[1]);

            if (edgeCount == leafCount) {
                toNextBranch = 2;
            }
            if (toNextBranch == 1 || leafCount == 0) {
                curEdge[0] = curEdge[1];
                curEdge[1] += 1;
                toNextBranch++;
                edgeCount--;
                continue;
            }
            if (toNextBranch == 2) {
                curEdge[1] += 1;
                toNextBranch--;
                leafCount--;
                edgeCount--;
                continue;
            }
        }
        System.out.println(curEdge[0] + " " + curEdge[1]);

    }

}
