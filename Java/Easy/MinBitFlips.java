package Easy;

public class MinBitFlips {
    public int minBitFlips(int start, int goal) {
        int dif = start ^ goal;

        return Integer.bitCount(dif);
    }
}
