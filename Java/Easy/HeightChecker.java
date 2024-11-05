package Easy;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int cnt = 0;

        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}
