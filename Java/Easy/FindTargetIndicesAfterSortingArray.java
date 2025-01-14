package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int ind = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            if (num == target) {
                ans.add(ind);
            }

            ind++;
        }

        return ans;
    }
}
