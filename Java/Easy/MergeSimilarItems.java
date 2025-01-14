package Easy;

import java.util.*;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
