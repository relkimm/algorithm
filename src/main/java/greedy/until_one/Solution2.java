package greedy.until_one;

public class Solution2 {
    public static void main(String[] args) {
        final Solution2 solution2= new Solution2();
        System.out.println(solution2.untilOne(23, 3));
    }

    public int untilOne(int n, int k) {
        int count = 0;

        while(true) {
            int target = (n / k) * k;
            count += n - target;
            n = target;
            if(n < k) {
                break;
            }
            n /= k;
            count++;
        }
        return count - 1;
    }
}
