package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = 0;
        int predVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char curEl = s.charAt(i);
            int curVal = romanMap.get(curEl);

            if (curVal < predVal) {
                res -= curVal;
            } else {
                res += curVal;
            }
            predVal = curVal;
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt(input);

        System.out.println(result);

        scanner.close();
    }
}
