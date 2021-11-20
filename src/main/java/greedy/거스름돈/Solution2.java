package greedy.거스름돈;

public class Solution2 {
    public static void main(String[] args) {
        int count = 0;
        int money = 1260;
        int[] coins = new int[] {500, 100, 50 , 10};

        for(int i=0; i<coins.length; i++) {
            count += money / coins[i];
            money %= coins[i];
        }
        System.out.println(count);
    }
}
