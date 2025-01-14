package Easy;

public class CellsWithOddValuesInMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrements = new int[m];
        int[] colIncrements = new int[n];

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            rowIncrements[row]++;
            colIncrements[col]++;
        }

        int oddCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int totalIncrements = rowIncrements[i] + colIncrements[j];
                if (totalIncrements % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
