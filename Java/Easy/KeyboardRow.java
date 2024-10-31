package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        for (char c : "qwertyuiop".toCharArray()) {
            row1.add(c);
        }

        for (char c : "asdfghjkl".toCharArray()) {
            row2.add(c);
        }

        for (char c : "zxcvbnm".toCharArray()) {
            row3.add(c);
        }

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowWord = word.toLowerCase();

            HashSet<Character> set = new HashSet<>();

            for (char c : lowWord.toCharArray()) {
                set.add(c);
            }

            if (row1.containsAll(set) || row2.containsAll(set) || row3.containsAll(set)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
