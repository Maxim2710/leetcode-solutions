package Easy;

import java.util.HashSet;
import java.util.List;

public class SumOfSquaresOfDistinctCounts {
    public int sumCounts(List<Integer> nums) {
        int totSum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));

                int uniqueEl = set.size();

                totSum += uniqueEl * uniqueEl;
            }
        }

        return totSum;
    }
}
