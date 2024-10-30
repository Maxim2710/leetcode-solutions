package Easy;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> countDigit = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (countDigit.containsKey(nums[i])) {
                return true;
            }

            countDigit.put(nums[i], 1);
        }

        return false;
    }
}
