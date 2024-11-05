package Easy;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int maxEl = nums[nums.length - 1];
        int result = 0;
        int counter = 0;
        while (counter < k) {
            result += maxEl;
            counter++;
            maxEl++;
        }

        return result;
    }
}
