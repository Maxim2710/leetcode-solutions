package Easy;

import java.util.Scanner;

public class FindFirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();

        FindFirstOccurrence findFirstOccurrence = new FindFirstOccurrence();

        int result = findFirstOccurrence.strStr(haystack, needle);

        System.out.println(result);
    }
}
