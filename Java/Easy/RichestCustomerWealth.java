package Easy;

import java.net.Inet4Address;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;

        int maxWealth = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                currentSum += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentSum);
            currentSum = 0;
        }

        return maxWealth;
    }
}
