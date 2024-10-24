package Easy;

import java.util.Scanner;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pref = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length() - 1);

                if (pref.isEmpty()) {
                    return "";
                }
            }
        }

        return pref;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.longestCommonPrefix(strs);

        System.out.println(result);

        scanner.close();
    }
}
