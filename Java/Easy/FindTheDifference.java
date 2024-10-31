package Easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] lettersArr = new int[26];

        for (char c : s.toCharArray()) {
            lettersArr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            lettersArr[c - 'a']--;

            if (lettersArr[c - 'a'] < 0) {
                return c;
            }
        }

        return ' ';
    }
}
