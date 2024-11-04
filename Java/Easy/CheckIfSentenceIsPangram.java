package Easy;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        return set.size() == 26;
    }
}
