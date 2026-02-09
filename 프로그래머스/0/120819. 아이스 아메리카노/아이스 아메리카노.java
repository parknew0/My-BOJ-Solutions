class Solution {
    public int[] solution(int money) {
        int coffeeCount = money / 5500;
        int change = money % 5500;

        return new int[]{coffeeCount, change};
        
    }
}