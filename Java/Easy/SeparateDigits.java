package Easy;

import java.util.ArrayList;
import java.util.List;

public class SeparateDigits {
    public int[] separateDigits(int[] nums) {
        List<Integer> list1 = new ArrayList<>();

        for (int num : nums) {
            String sNum = Integer.toString(num);
            for (char c : sNum.toCharArray()) {
                list1.add(Character.getNumericValue(c));
            }
        }

        int[] result = new int[list1.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list1.get(i);
        }

        return result;
    }
}
