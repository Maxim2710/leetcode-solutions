package Easy;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        int len = 0;
        boolean flagOdd = false;

        for (int el : hashMap.values()) {
            if (el % 2 == 0) {
                len += el;
            } else {
                flagOdd = true;
                len += el - 1;
            }
        }

        if (flagOdd) {
            len++;
        }

        return len;
    }
}
