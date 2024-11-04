package Easy;

public class SentenceReconstructor {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] resultArr = new String[words.length];

        for (String word : words) {
            int pos = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            resultArr[pos] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", resultArr);
    }
}
