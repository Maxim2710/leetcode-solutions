package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPeopleBySizes {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> sizeToGroup = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            sizeToGroup.putIfAbsent(size, new ArrayList<>());
            List<Integer> group = sizeToGroup.get(size);

            group.add(i);

            if (group.size() == size) {
                result.add(new ArrayList<>(group));
                group.clear();
            }
        }

        return result;
    }
}
