package Easy;

import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int checkedCountElement = map.get(s.charAt(0));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == s.charAt(0)) {
                continue;
            }

            if (entry.getValue() != checkedCountElement) {
                return false;
            }
        }

        return true;
    }
}
