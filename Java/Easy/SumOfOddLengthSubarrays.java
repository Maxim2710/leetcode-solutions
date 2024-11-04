package Easy;

public class SumOfOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int totSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j + i <= n; j += 2) {
                for (int x = i; x < j + i; x++) {
                    totSum += arr[x];
                }
            }
        }

        return totSum;
    }
}
