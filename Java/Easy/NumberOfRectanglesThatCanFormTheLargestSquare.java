package Easy;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSize = 0;
        int cnt = 0;

        for (int[] rect : rectangles) {
            int maxSide = Math.min(rect[0], rect[1]);

            if (maxSide > maxSize) {
                maxSize = maxSide;
                cnt = 1;
            } else if (maxSide == maxSize) {
                cnt++;
            }
        }

        return cnt;
    }
}
