package Easy;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] lettersArr = new int[26];

        for (char c : magazine.toCharArray()) {
            lettersArr[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (lettersArr[c - 'a'] == 0) {
                return false;
            }

            lettersArr[c - 'a']--;
        }

        return true;
    }

    // abcdefg  oooecdf
}
