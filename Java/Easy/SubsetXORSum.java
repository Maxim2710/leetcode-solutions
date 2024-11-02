package Easy;

public class SubsetXORSum {
    public int subsetXORSum(int[] nums) {
        return subsetXORSumHelper(nums, 0, 0);
    }

    private int subsetXORSumHelper(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        return subsetXORSumHelper(nums, index + 1, currentXOR ^ nums[index]) +
                subsetXORSumHelper(nums, index + 1, currentXOR);
    }
}
