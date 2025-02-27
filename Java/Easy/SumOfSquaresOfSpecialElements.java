package Easy;

public class SumOfSquaresOfSpecialElements {
    public int sumOfSquares(int[] nums) {
        int sumSpec = 0;
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumSpec += nums[i - 1] * nums[i - 1];
            }
        }

        return sumSpec;
    }
}
