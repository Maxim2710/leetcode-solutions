package Easy;

public class CountSubstringsThatSatisfyKConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int cntZeroes = 0;
            int cntOnes = 0;

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    cntZeroes++;
                } else {
                    cntOnes++;
                }

                if (cntZeroes > k && cntOnes > k) break;

                if (cntZeroes <= k || cntOnes <= k) {
                    count++;
                }
            }
        }

        return count;
    }
}
