package Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    private static final String[] MAPPING = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits.length() == 0) {
            return results;
        }

        findComb("", digits, 0, results);

        return results;
    }

    private void findComb(String comb, String digits, int i, List<String> results) {
        if (i == digits.length()) {
            results.add(comb);
            return;
        }

        char el = digits.charAt(i);
        String combLetters = MAPPING[el - '0'];

        for (char c : combLetters.toCharArray()) {
            findComb(comb + c, digits, i + 1, results);
        }

    }
}
