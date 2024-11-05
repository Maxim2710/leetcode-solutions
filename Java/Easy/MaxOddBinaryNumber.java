package Easy;

public class MaxOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        int cntZeros = 0;
        int cntOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                cntOnes++;
            } else {
                cntZeros++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cntOnes - 1; i++) {
            sb.append('1');
        }

        for (int i = 0; i < cntZeros; i++) {
            sb.append('0');
        }

        sb.append('1');

        return sb.toString();
    }
}
