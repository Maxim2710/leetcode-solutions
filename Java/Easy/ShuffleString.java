package Easy;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            sb.append(' ');
        }

        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}
