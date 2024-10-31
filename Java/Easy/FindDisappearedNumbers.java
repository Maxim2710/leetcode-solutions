package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] checkedDigits = new boolean[nums.length + 1];

        for (int num : nums) {
            checkedDigits[num] = true;
        }

        List<Integer> missingDigits = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!checkedDigits[i]) {
                missingDigits.add(i);
            }
        }

        return missingDigits;
    }
}
