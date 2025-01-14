package Easy;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
//    public int findNonMinOrMax(int[] nums) {
//        if (nums.length < 3) {
//            return -1;
//        }
//
//        Arrays.sort(nums);
//
//        return nums[1];
//    }

    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
        }

        for (int num : nums) {
            if (num != maxVal && num != minVal) {
                return num;
            }
        }

        return -1;
    }
}
