package Easy;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder cleanLine = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanLine.append(Character.toLowerCase(c));
            }
        }

        int leftInd = 0;
        int rightInd = cleanLine.length() - 1;

        while (leftInd < rightInd) {
            if (cleanLine.charAt(leftInd) != cleanLine.charAt(rightInd)) {
                return false;
            }
            rightInd--;
            leftInd++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Palindrome palindrome = new Palindrome();

        boolean result = palindrome.isPalindrome(inputLine);

        System.out.println(result);
    }
}
