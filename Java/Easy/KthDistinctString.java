package Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctString {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int numUniq = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                numUniq++;

                if (numUniq == k) {
                    return entry.getKey();
                }
            }
        }

        return "";
    }
}
