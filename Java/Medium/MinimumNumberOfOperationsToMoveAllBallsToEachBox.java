package Medium;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int count = 0;
        int ops = 0;
        for (int i = 0; i < n; i++) {
            answer[i] += ops;
            count += boxes.charAt(i) - '0';
            ops += count;
        }

        count = 0;
        ops = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += ops;
            count += boxes.charAt(i) - '0';
            ops += count;
        }

        return answer;
    }
}
