package Easy;

public class NumberOfMatches {
    private int cntMatches = 0;

    public int numberOfMatches(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                cntMatches += n / 2;
                n = n / 2;
            } else {
                cntMatches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return cntMatches;
    }
}
