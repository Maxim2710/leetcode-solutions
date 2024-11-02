package Easy;

public class MinimumOperations {
    public int minimumOperations(int[] nums) {
        int countOperations = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                continue;
            }

            countOperations++;
        }

        return countOperations;
    }
}
