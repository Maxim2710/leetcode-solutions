package Easy;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int minNum = Arrays
                .stream(nums)
                .min()
                .getAsInt();
        int maxNum = Arrays
                .stream(nums)
                .max()
                .getAsInt();

        return gcd(minNum, maxNum);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
