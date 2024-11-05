package Easy;

public class MinimumTimeToVisitPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);

            totalTime += Math.max(dx, dy);
        }

        return totalTime;
    }
}
