package greedy.거스름돈;

public class Solution {
    public static void main(String[] args) {
        final Solution solution = new Solution();
        int coinCount = solution.minCoinCount(3250);
        System.out.println("MIN Coin count is " + coinCount);
    }

    public int minCoinCount(int money) {
        int coinCount = 0;
        while(true) {
            if(money <= 0) {
                break;
            }
            final Coin coin = Coin.getChangeable(money);
            money = coin.giveChange(money);
            coinCount++;
        }
        return coinCount;
    }
}
