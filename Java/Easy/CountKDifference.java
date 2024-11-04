package Easy;

public class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int cntPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    cntPairs++;
                }
            }
        }

        return cntPairs;
    }
}
