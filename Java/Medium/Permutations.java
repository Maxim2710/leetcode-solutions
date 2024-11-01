package Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findAllComb(nums, new ArrayList<Integer>(), result);

        return result;
    }

    private void findAllComb(int[] nums, List<Integer> integers, List<List<Integer>> result) {
        if (integers.size() == nums.length) {
            result.add(new ArrayList<>(integers));
        } else {
            for (int num : nums) {
                if (integers.contains(num)) continue;
                integers.add(num);
                findAllComb(nums, integers, result);
                integers.removeLast();
            }
        }
    }
}
