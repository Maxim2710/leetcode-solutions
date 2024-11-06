package Easy;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
            if (i >= 2 && s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                sb.append((char) (num + 'a' - 1));
                i -= 3;
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) (num + 'a' - 1));
                i --;
            }
        }

        return sb.reverse().toString();
    }
}
