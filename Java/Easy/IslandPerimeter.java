package Easy;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    p += 4;

                    if (i > 0 && grid[i - 1][j] == 1) p -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) p -= 2;
                }
            }
        }

        return p;
    }
}
