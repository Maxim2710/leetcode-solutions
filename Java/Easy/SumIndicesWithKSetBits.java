package Easy;

import java.util.List;

public class SumIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sumEl = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(Integer.parseInt(Integer.toBinaryString(i))) == k) {
                sumEl += nums.get(i);
            }
        }

        return sumEl;
    }
}
