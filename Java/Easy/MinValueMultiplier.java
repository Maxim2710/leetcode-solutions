package Easy;

public class MinValueMultiplier {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minInd = findMinIndex(nums);
            nums[minInd] *= multiplier;
        }

        return nums;
    }

    private int findMinIndex(int[] nums) {
        int minIndex = 0;
        int minValue = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minIndex = i;
                minValue = nums[i];
            }
        }

        return minIndex;
    }
}
