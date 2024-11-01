package Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCntDigits = 0;
        int curCnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curCnt++;
            } else {
                maxCntDigits = Math.max(maxCntDigits, curCnt);
                curCnt = 0;
            }
        }

        maxCntDigits = Math.max(maxCntDigits, curCnt);

        return maxCntDigits;
    }
}