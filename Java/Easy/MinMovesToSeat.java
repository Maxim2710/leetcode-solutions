package Easy;

import java.util.Arrays;

public class MinMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int cntMoves = 0;

        for (int i = 0; i < seats.length; i++) {
            cntMoves += Math.abs(seats[i] - students[i]);
        }

        return cntMoves;
    }
}
