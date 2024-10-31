package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String reformatS = new String(sArr);
        String reformatT = new String(tArr);

        return reformatT.equals(reformatS);
    }
}
