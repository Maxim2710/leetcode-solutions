package Easy;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int firstCost = cost[0];
        int secondCost = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(firstCost, secondCost);
            firstCost = secondCost;
            secondCost = current;
        }

        return Math.min(firstCost, secondCost);
    }
}
