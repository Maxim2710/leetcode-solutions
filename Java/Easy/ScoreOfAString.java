package Easy;

public class ScoreOfAString {
    public int scoreOfString(String s) {
        char[] charS = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < charS.length - 1; i++) {
            sum += Math.abs(charS[i] - charS[i + 1]);
        }

        return sum;
    }
}
