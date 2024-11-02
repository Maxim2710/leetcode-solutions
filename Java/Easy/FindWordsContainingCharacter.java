package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexList = new ArrayList<>();
        int curInd = 0;

        for (String word : words) {
            if (word.indexOf(x) == -1) {
                curInd++;
                continue;
            }

            indexList.add(curInd);
            curInd++;
        }

        return indexList;
    }
}
