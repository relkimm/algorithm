package greedy.until_one;

public class Solution {
    public static void main(String[] args) {
        final Solution solution = new Solution();
        int count = solution.untilOne(25, 3);
        System.out.println(count);
    }

    public int untilOne(int n, int k) {
        int count = 0;
        while(true) {
            if(isNumberOne(n)) break;

            if(canDivide(n, k)) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
    }

    public boolean canDivide(int n, int k) {
        return n % k == 0;
    }

    public boolean isNumberOne(int n) {
        return n == 1;
    }
}
