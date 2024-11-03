package Easy;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayCreator {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] targetArr = new int[target.size()];

        for (int i = 0; i < target.size(); i++) {
            targetArr[i] = target.get(i);
        }

        return targetArr;
    }
}
