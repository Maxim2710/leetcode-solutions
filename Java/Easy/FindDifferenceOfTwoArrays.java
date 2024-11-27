package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> uniqueSet1 = new HashSet<>(set1);
        Set<Integer> uniqueSet2 = new HashSet<>(set2);

        uniqueSet1.removeAll(set2);
        uniqueSet2.removeAll(set1);

        List<Integer> l1 = new ArrayList<>(uniqueSet1);
        List<Integer> l2 = new ArrayList<>(uniqueSet2);

        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);

        return result;

    }
}
