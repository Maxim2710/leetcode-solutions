package Easy;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int curRes = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;

            curRes = curRes * 26 + value;
        }

        return curRes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();

        int result = excelSheetColumnNumber.titleToNumber(inputLine);

        System.out.println(result);
    }
}
