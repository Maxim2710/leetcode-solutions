package Easy;

public class CountingBits {
    public int[] countBits(int n) {
        int[] arrayBits = new int[n+1];

        arrayBits[0] = 0;

        for (int i = 1; i <= n; i++) {
            arrayBits[i] = arrayBits[i / 2] + (i % 2);
        }

        return arrayBits;
    }

}
