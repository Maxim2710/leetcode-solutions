package Easy;

public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                sb.append(shift(s.charAt(i - 1), s.charAt(i)));
            }
        }

        return sb.toString();
    }

    private char shift(char c, char c1) {
        int curDigit = Character.getNumericValue(c1);

        return (char) (curDigit + c);
    }
}
