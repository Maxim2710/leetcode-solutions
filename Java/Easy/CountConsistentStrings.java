package Easy;

import java.util.HashSet;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedCharSet = new HashSet<>();

        boolean flag = false;
        int cnt = 0;

        for (char c : allowed.toCharArray()) {
            allowedCharSet.add(c);
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char curChar = word.charAt(i);

                if (allowedCharSet.contains(curChar)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                cnt++;
            }
        }

        return cnt;
    }
}
