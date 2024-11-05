package Easy;

import java.util.HashSet;

public class MaxPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> strings = new HashSet<>();

        int cnt = 0;

        for (String word : words) {
            String str = new StringBuilder(word).reverse().toString();

            if (strings.contains(str)) {
                cnt++;
                strings.remove(str);
            } else {
                strings.add(word);
            }
        }

        return cnt;
    }
}
