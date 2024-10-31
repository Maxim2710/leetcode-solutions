package Easy;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int resultSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            resultSum += nums[i];
        }

        return resultSum;
    }
}
