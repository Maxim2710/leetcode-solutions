package Easy;

public class DesignNeighborSumService {
    private int[][] grid;
    private int n;

    public DesignNeighborSumService(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }

    public int adjacentSum(int value) {
        int[] pos = findPosition(value);
        int row = pos[0];
        int col = pos[1];

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int sum = 0;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isInBounds(newRow, newCol)) {
                sum += grid[newRow][newCol];
            }
        }

        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = findPosition(value);
        int row = pos[0];
        int col = pos[1];

        int[][] directions = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int sum = 0;

        for(int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isInBounds(newRow, newCol)) {
                sum += grid[newRow][newCol];
            }
        }

        return sum;
    }

    private int[] findPosition(int value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }
}
