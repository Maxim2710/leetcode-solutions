package Easy;

import java.util.*;


public class MinimumAverage {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        List<Double> averageList = new ArrayList<>();

        while (left < right) {
            double av = (nums[left] + nums[right]) / 2.0;

            averageList.add(av);

            left++;
            right--;
        }

        return Collections.min(averageList);
    }
}
