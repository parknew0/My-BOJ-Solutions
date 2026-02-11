import java.util.*;

class Solution {
    // bill의 제일 큰 면이 wallet의 제일 큰 면에 들어가고, bill의 제일 작은 면이 wallet의 제일 작은 면에 들어가면 종료
    public int solution(int[] wallet, int[] bill) {
        int walletBig = Arrays.stream(wallet).max().orElse(0);
        int walletSmall = Arrays.stream(wallet).min().orElse(0);
        int billBig = Arrays.stream(bill).max().orElse(0);
        int billSmall = Arrays.stream(bill).min().orElse(0);

        int count = 0;
        while (!(walletBig >= billBig && walletSmall >= billSmall)) {
            billBig = billBig / 2;

            if (billBig < billSmall) {
                int temp = billSmall;
                billSmall = billBig;
                billBig = temp;
            }
            count++;
        }
        return count;
    }
}