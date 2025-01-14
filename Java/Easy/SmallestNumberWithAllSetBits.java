package Easy;

public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int binNLen = Integer.toBinaryString(n).length();

        return Integer.parseInt("1".repeat(binNLen), 2);
    }
}
