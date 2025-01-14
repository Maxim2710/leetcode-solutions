package Easy;

public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] cnt = new int[size + 1];
        int[] res = new int[2];

        for (int[] row : grid) {
            for (int col : row) {
                cnt[col]++;
            }
        }

        for (int i = 1; i <= size; i++) {
            if (cnt[i] == 2) {
                res[0] = i;
            } else if (cnt[i] == 0) {
                res[1] = i;
            }
        }

        return res;
    }
}
