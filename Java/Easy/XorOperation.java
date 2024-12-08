package Easy;

public class XorOperation {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}