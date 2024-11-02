package Easy;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] numsDuplicate = new int[n * 2];

        for (int i = 0; i < nums.length; i++) {
            numsDuplicate[i] = nums[i];
            numsDuplicate[i + n] = nums[i];
        }

        return numsDuplicate;
    }
}
