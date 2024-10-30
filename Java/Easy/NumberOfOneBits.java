package Easy;

public class NumberOfOneBits {
//    public int hammingWeight(int n) {
//        return Integer.bitCount(n);
//    }
    public int hammingWeight(int n) {
        String binString = Integer.toBinaryString(n);

        int count = 0;
        for (char c : binString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }
}
