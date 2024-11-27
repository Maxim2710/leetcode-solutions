package Easy;

import java.util.*;

public class FrequencySort {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> {
            if (!Objects.equals(a.getValue(), b.getValue())) {
                return a.getValue() - b.getValue();
            }
            return b.getKey() - a.getKey();
        });

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int num = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.add(num);
            }
        }

        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = result.get(i);
        }

        return sortedArray;
    }
}
