package Easy;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String repWord = word;

        while (sequence.contains(repWord)) {
            k++;
            repWord += word;
        }

        return k;
    }
}
