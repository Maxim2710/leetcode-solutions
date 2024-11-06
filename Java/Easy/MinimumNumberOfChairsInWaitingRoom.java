package Easy;

public class MinimumNumberOfChairsInWaitingRoom {
    public int minimumChairs(String s) {
        int countChairs = 0;
        int maxChairs = 0;

        for (char c : s.toCharArray()) {
            if (c == 'E') countChairs++;
            else if (c == 'L') countChairs--;

            maxChairs = Math.max(Math.abs(countChairs), maxChairs);
        }

        return maxChairs;
    }
}
