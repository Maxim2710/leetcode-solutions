package Easy;

public class CountingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String word : words) {
            boolean flag = true;
            if (word.length() < pref.length()) {
                continue;
            }

            for (int i = 0; i < pref.length(); i++) {
                if (word.charAt(i) != pref.charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;
        }

        return count;
    }
}
