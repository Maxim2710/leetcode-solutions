package Easy;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int ind = 0;

        for (int i = 1; i <= n / 2; i++) {
            result[ind++] = -i;
            result[ind++] = i;
        }

        if (n % 2 != 0) {
            result[ind] = 0;
        }

        return result;
    }
}
