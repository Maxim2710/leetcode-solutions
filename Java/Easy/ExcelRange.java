package Easy;

import java.util.ArrayList;
import java.util.List;

public class ExcelRange {
    public static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        char startCol = s.charAt(0);
        int startRow = s.charAt(1) - '0';
        char endCol = s.charAt(3);
        int endRow = s.charAt(4) - '0';

        for (char col = startCol; col <= endCol; col++) {
            for (int row = startRow; row <= endRow; row++) {
                result.add("" + col + row);
            }
        }

        return result;
    }
}
