package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curRow = new ArrayList<>();

        curRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                curRow.set(j, curRow.get(j) + curRow.get(j + 1));
            }

            curRow.add(1);
        }

        return curRow;
    }
}
