package Easy;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int countPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
}
