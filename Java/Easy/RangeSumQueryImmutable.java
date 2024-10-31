package Easy;

public class RangeSumQueryImmutable {
    private int[] initNums;

    public RangeSumQueryImmutable(int[] nums) {
        initNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i ++) {
            initNums[i + 1] = nums[i] + initNums[i];
        }
    }

    public int sumRange(int left, int right) {
        return initNums[right + 1] - initNums[left];
    }

}
