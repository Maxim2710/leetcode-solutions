package Easy;

public class FindIfDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int sumDigitsLessTen = 0;
        int sumDigitsMoreTen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10) {
                sumDigitsMoreTen += nums[i];
            } else {
                sumDigitsLessTen += nums[i];
            }
        }

        return sumDigitsLessTen != sumDigitsMoreTen;
    }
}
