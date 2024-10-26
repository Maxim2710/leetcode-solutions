package Easy;

import java.util.Scanner;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            char curEl = (char)('A' + rem);
            sb.insert(0, curEl);
            columnNumber /= 26;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int columnNumber = scanner.nextInt();

        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

        String result = excelSheetColumnTitle.convertToTitle(columnNumber);

        System.out.println(result);
    }
}
