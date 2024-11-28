package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> uniqNum = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (!uniqNum.add(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}
