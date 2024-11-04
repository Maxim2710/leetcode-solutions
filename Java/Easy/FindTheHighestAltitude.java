package Easy;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = Integer.MIN_VALUE;
        int curSum = 0;

        for (int j : gain) {
            curSum += j;

            if (curSum > maxAltitude) maxAltitude = (curSum > 0) ? curSum : 0;
        }

        return maxAltitude;

    }
}
