package Hard;

public class UniquePathsIII {
    public int uniquePathsIII(int[][] grid) {
        int empty = 1;
        int startX = -1;
        int startY = -1;
        int endX = -1;
        int endY = -1;

        for (int i = 0; i < grid.length; ++i)
            for (int j = 0; j < grid[0].length; ++j)
                if (grid[i][j] == 0) {
                    ++empty;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 2) {
                    endX = i;
                    endY = j;
                }

        dfs(grid, empty, startX, startY, endX, endY);

        return pathsCount;
    }

    private int pathsCount = 0;

    private void dfs(int[][] grid, int empty, int x, int y, int endX, int endY) {
        if (x < 0 || x == grid.length || y < 0 || y == grid[0].length)
            return;
        if (grid[x][y] < 0)
            return;
        if (x == endX && y == endY) {
            if (empty == 0)
                ++pathsCount;
            return;
        }

        grid[x][y] = -2;
        dfs(grid, empty - 1, x + 1, y, endX, endY);
        dfs(grid, empty - 1, x - 1, y, endX, endY);
        dfs(grid, empty - 1, x, y + 1, endX, endY);
        dfs(grid, empty - 1, x, y - 1, endX, endY);
        grid[x][y] = 0;
    }
}
