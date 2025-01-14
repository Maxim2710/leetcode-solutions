package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringHalvesAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int n = s.length();
        int midN = n / 2;
        int cntA = 0;
        int cntB = 0;

        for (int i = 0; i < midN; i++) {
            if (vowels.contains(s.charAt(i))) {
                cntA++;
            }

            if (vowels.contains(s.charAt(i + midN))) {
                cntB++;
            }
        }

        return cntA == cntB;
    }
}
