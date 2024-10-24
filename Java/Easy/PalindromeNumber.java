package Easy;

import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
        StringBuilder sb1 = new StringBuilder(String.valueOf(x));
        return sb.compareTo(sb1) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(x);

        System.out.println(result);

        scanner.close();
    }
}
