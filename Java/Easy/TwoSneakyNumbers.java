package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSneakyNumbers {
//    public int[] getSneakyNumbers(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int k = 0;
//        int[] sneakyNumbers = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (k == 2) {
//                break;
//            }
//            if (map.containsKey(nums[i])) {
//                sneakyNumbers[k] = nums[i];
//                k++;
//            }
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        return sneakyNumbers;
//
//    }
    public int[] getSneakyNumbers(int[] nums) {
        int[] sneakyNumbers = new int[2];
        int k = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                sneakyNumbers[k] = nums[i];
                k++;
            }

            if (k == 2) {
                break;
            }
        }

        return sneakyNumbers;
    }
}