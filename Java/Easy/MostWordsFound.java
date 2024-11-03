package Easy;

public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int cntWords = 0;
        int maxWords = Integer.MIN_VALUE;

        for (String sentence : sentences) {
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    cntWords++;
                }
            }

            maxWords = Math.max(maxWords, cntWords);
            cntWords = 0;
        }

        return maxWords + 1;
    }
}
