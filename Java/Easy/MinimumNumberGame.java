package Easy;

import java.util.Arrays;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        int index = 0;

        for (int i = 1; i < nums.length; i += 2) {
            arr[index++] = nums[i];
            arr[index++] = nums[i - 1];
        }

        return arr;
    }
}
