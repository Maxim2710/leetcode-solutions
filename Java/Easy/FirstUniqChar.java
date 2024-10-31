package Easy;

import java.util.HashMap;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mapCounter = new HashMap<>();

        for (char c : s.toCharArray()) {
            mapCounter.put(c, mapCounter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mapCounter.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
