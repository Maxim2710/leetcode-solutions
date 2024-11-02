package Easy;

public class MaxLocalMatrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int newSize = n - 2;
        int[][] maxLocal = new int[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                int maxVal = Integer.MIN_VALUE;

                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        maxVal = Math.max(maxVal, grid[row][col]);
                    }
                }

                maxLocal[i][j] = maxVal;
            }
        }

        return maxLocal;
    }

}
