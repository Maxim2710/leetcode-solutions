package Easy;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int indexEl = word.indexOf(ch);

        if (indexEl == -1) {
            return word;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (i <= indexEl) {
                sb1.append(word.charAt(i));
            } else {
                sb2.append(word.charAt(i));
            }
        }

        return sb1.reverse() + sb2.toString();
    }
}
