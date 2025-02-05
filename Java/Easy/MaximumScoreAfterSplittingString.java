package Easy;

public class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        int cntOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') cntOnes++;
        }

        int rightOnes = cntOnes;
        int leftZeros = 0;
        int maximum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') leftZeros++;
            else rightOnes--;

            maximum = Math.max(maximum, leftZeros + rightOnes);
        }

        return maximum;
    }
}
