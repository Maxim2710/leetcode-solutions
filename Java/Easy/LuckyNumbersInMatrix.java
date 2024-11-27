package Easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minInRow = matrix[i][0];
            int minInd = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minInd = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minInd] > minInRow) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                lucky.add(minInRow);
            }
        }

        return lucky;
    }
}
