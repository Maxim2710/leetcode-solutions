package Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int noneZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[noneZero] = nums[i];
                noneZero++;
            }
        }

        for (int i = noneZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
