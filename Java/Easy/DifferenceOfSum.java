package Easy;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfSum {
    public int differenceOfSum(int[] nums) {
        int sumOfNums = 0;
        int sumOfDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i];

            while (nums[i] > 0) {
                int currentDigit = nums[i] % 10;
                sumOfDigits += currentDigit;
                nums[i] /= 10;
            }


        }

        return Math.abs(sumOfNums - sumOfDigits);
    }
}
