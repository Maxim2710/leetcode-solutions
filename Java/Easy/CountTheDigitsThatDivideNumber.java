package Easy;

import java.util.ArrayList;
import java.util.List;

public class CountTheDigitsThatDivideNumber {
    public int countDigits(int num) {
        List<Integer> digitsInNum = new ArrayList<>();

        int modifyNum = num;
        while (modifyNum > 0) {
            digitsInNum.add(modifyNum % 10);
            modifyNum /= 10;
        }

        int cntDig = 0;

        for (int val : digitsInNum) {
            if (num % val == 0) {
                cntDig++;
            }
        }

        return cntDig;
    }
}
