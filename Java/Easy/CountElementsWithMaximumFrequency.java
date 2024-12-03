package Easy;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int k = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, map.get(num));
        }

        for (int el : map.values()) {
            if (el == maxCount) k++;
        }

        return maxCount * k;
    }
}
