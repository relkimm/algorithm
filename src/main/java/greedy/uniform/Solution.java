package greedy.uniform;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] lost = new int[] {3};
        int[] reserve = new int[] {1, 5, 2};

        final Solution solution = new Solution();
        int answer = solution.answer(5, lost, reserve);
        System.out.println(answer);
    }

    public int answer(int n, int[] lost, int[] reserve) {
        final Map<Integer, Boolean> lostMap = new HashMap<>();
        for(int i=0; i<lost.length; i++) {
            lostMap.put(lost[i], true);
        }

        for(int i=0; i<reserve.length; i++) {
            int number = reserve[i];
            if(canReserve(lostMap, number)) {
                int lostIndex = getLostIndex(lostMap, number);
                lostMap.remove(lostIndex);
            }
        }
        return n - lostMap.size();
    }

    public boolean canReserve(Map<Integer, Boolean> lostMap, int number) {
        return lostMap.containsKey(next(number)) || lostMap.containsKey(prev(number));
    }

    public int getLostIndex(Map<Integer, Boolean> lostMap, int number) {
        if(lostMap.containsKey(next(number))) {
            return next(number);
        }
        return prev(number);
    }

    public int next(int number) {
        return number + 1;
    }

    public int prev(int number) {
        return number - 1;
    }
}
