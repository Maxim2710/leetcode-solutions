package Easy;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String strNum = Integer.toString(num);

        StringBuilder sb = new StringBuilder();
        boolean changed = false;

        for (char c : strNum.toCharArray()) {
            if (!changed && c == '6') {
                sb.append('9');
                changed = true;
            } else {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
