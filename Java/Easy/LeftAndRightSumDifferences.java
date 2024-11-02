package Easy;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 0; i < n; i++) {
            leftSum[i] = (i == 0) ? 0 : leftSum[i - 1] + nums[i - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            rightSum[j] = (j == n - 1) ? 0 : rightSum[j + 1] + nums[j + 1];
        }

        for (int x = 0; x < n; x++) {
            answer[x] = Math.abs(leftSum[x] - rightSum[x]);
        }

        return answer;
    }

}
