package Easy;

import java.util.HashMap;

public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char cntSymbol = 'a';

        for (char c : key.toCharArray()) {
            if (c != ' ' && !map.containsKey(c)) {
                map.put(c, cntSymbol);
                cntSymbol++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(c));
            }
        }

        return sb.toString();
    }
}
