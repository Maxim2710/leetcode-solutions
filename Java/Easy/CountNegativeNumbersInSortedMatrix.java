package Easy;

public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    cnt++;
                } else {
                    break;
                }
            }
        }

        return cnt;
    }
}
