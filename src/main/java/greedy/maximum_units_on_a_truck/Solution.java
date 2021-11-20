package greedy.maximum_units_on_a_truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        final Solution solution = new Solution();
        final List<Unit> units = solution.getUnits();
        final List<Unit> sortedUnits = solution.sort(units, true);
        final int totalToyCount = solution.getTotalToyCount(sortedUnits);
        System.out.println(totalToyCount);

    }

    private List<Unit> getUnits() {
        return Arrays.asList(
                new Unit(3, new Box(1)),
                new Unit(2, new Box(2)),
                new Unit(1, new Box(4)),
                new Unit(2, new Box(3))
        );
    }

    private List<Unit> sort(List<Unit> units, boolean reverse) {
        int returnA = reverse == true ? 1 : -1;
        int returnB = reverse == true ? -1 : 1;

        final List<Unit> result = new ArrayList<>(units);
        result.sort((a, b) -> {
            int aToyCount = a.getBox().getToyCount();
            int bToyCount = b.getBox().getToyCount();
            if(aToyCount < bToyCount) {
                return returnA;
            } else if(aToyCount == bToyCount) {
                return 0;
            }
            return returnB;
        });
        return result;
    }

    private int getTotalToyCount(List<Unit> units) {
        int totalToyCount = 0;
        int leftBox = 4;

        for(Unit unit : units) {
            for(int i=0; i<unit.getBoxCount(); i++) {
                if(leftBox <= 0) {
                    break;
                }
                totalToyCount += unit.getBox().getToyCount();
                leftBox--;
            }
        }
        return totalToyCount;
    }
}
