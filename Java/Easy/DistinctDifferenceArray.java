package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctDifferenceArray {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Set<Integer> prefixSet = new HashSet<>();
        Map<Integer, Integer> suffixCount = new HashMap<>();

        for (int num : nums) {
            suffixCount.put(num, suffixCount.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            prefixSet.add(nums[i]);

            suffixCount.put(nums[i], suffixCount.get(nums[i]) - 1);
            if (suffixCount.get(nums[i]) == 0) {
                suffixCount.remove(nums[i]);
            }

            result[i] = prefixSet.size() - suffixCount.size();
        }

        return result;
    }
}
