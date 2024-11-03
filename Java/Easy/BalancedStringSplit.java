package Easy;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int balCnt = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') {
                bal--;
            } else if (c == 'L') {
                bal++;
            }

            if (bal == 0) {
                balCnt++;
            }
        }

        return balCnt;
    }
}
