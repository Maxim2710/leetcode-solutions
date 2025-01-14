package Easy;

import java.util.*;

public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        for (int num : nums3) set3.add(num);

        Set<Integer> result = new HashSet<>();

        if (!set1.isEmpty() && !set2.isEmpty()) {
            for (int num : set1) {
                if (set2.contains(num)) {
                    result.add(num);
                }
            }
        }

        if (!set2.isEmpty() && !set3.isEmpty()) {
            for (int num : set2) {
                if (set3.contains(num)) {
                    result.add(num);
                }
            }
        }

        if (!set1.isEmpty() && !set3.isEmpty()) {
            for (int num : set1) {
                if (set3.contains(num)) {
                    result.add(num);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
