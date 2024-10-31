package Easy;

import java.util.HashSet;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] resultArray = new int[resultSet.size()];
        int index = 0;
        for (int el : resultSet) {
            resultArray[index] = el;
            index++;
        }

        return resultArray;
    }
}
