package Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int realSum = 0;

        for (int num : nums) {
            realSum += num;
        }

        return expectedSum - realSum;
    }
}
