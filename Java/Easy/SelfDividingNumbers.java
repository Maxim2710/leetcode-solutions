package Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) result.add(i);
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int originalNum = num;

        while (num > 0) {
            int curDigit = num % 10;

            if (curDigit == 0 || originalNum % curDigit != 0) return false;

            num /= 10;
        }

        return true;
    }
}
