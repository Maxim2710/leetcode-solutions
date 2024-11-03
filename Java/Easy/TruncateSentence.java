package Easy;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int control = 0;

        for (char c : s.toCharArray()) {
            if (control == k) break;

            if (c == ' ') {
                control++;
            }
            if (control != k) sb.append(c);
        }

        return sb.toString();
    }
}
