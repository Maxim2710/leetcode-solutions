package Easy;

import java.util.HashMap;
import java.util.Map;

public class XOROfDuplicates {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result ^= entry.getKey();
            }
        }

        return result;
    }
}
