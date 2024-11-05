package Easy;

public class AsteriskCounter {
    public int countAsterisks(String s) {
        int cntAsterisks = 0;
        boolean flag = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                flag = !flag;
            } else if (c == '*' && !flag){
                cntAsterisks++;
            }
        }

        return cntAsterisks;
    }
}
