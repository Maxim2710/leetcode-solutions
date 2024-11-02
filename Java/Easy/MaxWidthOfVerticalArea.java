package Easy;

import java.util.Arrays;

public class MaxWidthOfVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoordinates = new int[points.length];

        for (int i = 0; i < xCoordinates.length; i++) {
            xCoordinates[i] = points[i][0];
        }

        Arrays.sort(xCoordinates);

        int maxDist = Integer.MIN_VALUE;
        for (int i = 1; i < xCoordinates.length; i++) {
            if (maxDist < xCoordinates[i] - xCoordinates[i - 1]) {
                maxDist = xCoordinates[i] - xCoordinates[i - 1];
            }
        }

        return maxDist;
    }
}
