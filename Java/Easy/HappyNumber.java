package Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNum(n);
        }

        return n == 1;
    }

    private int getNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            sum += lastDig * lastDig;
            n /= 10;
        }

        return sum;
    }
}
